# 입력값 받기
n = int(input())
h_list = list(map(int, input().split()))
arr = []
for i in range(1, n+1):
    arr.append([i, h_list[i-1]]) # [키, 순서] 형태로 삽입

final_arr = [0] * n
for i in arr:
    h = i[0]
    frontThanMe = i[1]
    count = 0
    for j in range(n):
        if final_arr[j] == 0 and count != frontThanMe:
            count += 1
            continue
        elif final_arr[j] ==0 and count == frontThanMe:
            final_arr[j] = h
            break

print(*final_arr)