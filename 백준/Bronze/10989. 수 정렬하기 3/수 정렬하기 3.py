import sys

n = int(sys.stdin.readline())
list = [0]*10000
for i in range(n):
    k = int(sys.stdin.readline())
    list[k-1] += 1

for i in range(10000):
    j = list[i]
    for k in range(j):
        print(str(i+1))