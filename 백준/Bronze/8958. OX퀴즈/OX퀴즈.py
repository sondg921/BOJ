case = int(input())
for i in range(case):
    list = []
    s = input()
    for j in range(len(s)):
        if s[j] == "X":
            list.append(0)
        else :
            if len(list) == 0:
                list.append(1)
            else:
                list.append(list[j-1]+1)
    index = 0
    for k in range(len(list)):
        index += list[k]
    print(index)