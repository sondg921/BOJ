n = int(input())
ls = []
for i in range(n):
    a = int(input())
    if a != 0:
        ls.append(a)
    else:
        ls.pop()
print(sum(ls))