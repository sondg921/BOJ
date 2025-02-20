n = int(input())
list = list(map(int,input().split()))
h = max(list)
for i in range(len(list)):
    list[i] = int(list[i])/h*100
answer = sum(list) / n
print(str(answer))