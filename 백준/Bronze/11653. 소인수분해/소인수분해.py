N = int(input())
list = []
for i in range(2,N+1):
    while N%i == 0:
        list.append(i)
        N = N//i
for k in range(len(list)):
    print(list[k])