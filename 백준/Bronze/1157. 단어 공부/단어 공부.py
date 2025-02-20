alp = input().upper()
s = set(alp)
a_ls = list(s)
c_ls = []
for i in a_ls:
    c_ls.append(alp.count(i))
max = max(c_ls)
if c_ls.count(max) != 1:
    print("?")
else:
    print(a_ls[c_ls.index(max)])