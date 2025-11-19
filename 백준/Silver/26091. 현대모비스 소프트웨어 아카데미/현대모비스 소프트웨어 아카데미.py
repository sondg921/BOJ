# 입력
n, m = map(int, input().split())
values = list(map(int, input().split()))

# 능력치 오름차순 정렬
values.sort()
left, right = 0, n-1
teams = 0

while left < right:
    if values[left] + values[right] >= m:
        teams += 1
        left += 1
        right -= 1
    else:
        left += 1

print(teams)