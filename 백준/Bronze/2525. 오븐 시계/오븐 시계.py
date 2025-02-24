A, B = map(int, input().split())
C = int(input())
if B + C >= 60:
    D = (B + C) % 60
    A = A + (B + C)//60
else :
    D = B + C
if A >= 24 :
    A = A - 24
print(A,D)