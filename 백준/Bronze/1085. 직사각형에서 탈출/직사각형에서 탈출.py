def func():
    x, y, w, h = map(int,input().split())
    ls = []
    a = w-x
    b = h-y
    ls.append(b)
    ls.append(x)
    ls.append(y)
    ls.append(a)
    m = min(ls)
    return m
print(func())