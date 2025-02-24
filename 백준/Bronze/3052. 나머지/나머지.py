list = []
for k in range(1,11):
    a = int(input())
    b = a%42
    if b in list:
        pass
    else :
        list.append(b)
print(len(list))