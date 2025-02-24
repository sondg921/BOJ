T = int(input())
for i in range(T):
    list = input().split()
    answer = 0
    for k in range(len(list)):
        if k == 0 :
            answer += float(list[k])
        else :
            if list[k] == "@":
                answer *= 3
            if list[k] == "%":
                answer += 5
            if list[k] == "#":
                answer -= 7
    print(f"{answer:.2f}")