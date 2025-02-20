t = int(input())
for i in range(t):
    list = []
    r,s = input().split()
    r = int(r)
    for j in range(len(s)):
        list.append(s[j])
    fs = ""
    for k in range(len(list)):
        fs = fs + list[k]*r
    print(fs)