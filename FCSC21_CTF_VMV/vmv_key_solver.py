import string

int_to_bytes = lambda val : "".join([chr((val & (0xff << i*8)) >> i*8) for i in range(4)])
printcheck = lambda lol : all(c in string.printable for c in lol)


def invmod(val, mod):
    return pow(val, -1, mod)


def crt(r1, r2):
    n1 = 0x77f3
    n2 = 0x7c49
    x, y = invmod(n1, n2), invmod(n2, n1)
    m = n1 * n2
    n = r2 * x * n1 + r1 * y * n2
    q, r = (m, n % m)
    # return a printable result from the possible solutions
    for k in range(5):
        res = q*k + r
        out = int_to_bytes(res)
        if printcheck(out):
            return out


if __name__ == "__main__":
    
    key = ""
    key += int_to_bytes(invmod(0x117052c0, 0x7fffffff))
    key += crt(0x4926,0x3159)
    key += int_to_bytes(invmod(0x278bce9d, 0x7fffffff))
    key += crt(0x28b2,0x44a9)

    print(key)
    #w3NeEdT0gODe3p3r
