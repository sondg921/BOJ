from collections import deque

# 세로 N, 가로 M, 연구소 입력 받기
N, M = map(int, input().split())
arr = []
for i in range(N):
    dataList = list(map(int, input().split()))
    arr.append(dataList)

# 바이러스가 퍼진 연구소를 반환하는 함수
def virusBFS(arr, N, M):
    copy = [row[:] for row in arr]
    # 초기 바이러스 위치를 큐에 삽입
    q = deque()
    for i in range(N):
        for j in range(M):
            if copy[i][j] == 2:
                q.append((i, j))

    # 바이러스 확산
    direction = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    while q:
        x, y = q.popleft()
        for dx, dy in direction:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < M and copy[nx][ny] == 0:
                copy[nx][ny] = 2
                q.append((nx, ny))

    return copy

def countSafeZone(arr, N, M):
    sum = 0
    for i in range(N):
        for j in range(M):
            if arr[i][j] == 0:
                sum += 1
    return sum

def makeWalls(arr, N, M):
    index = 0
    # 빈칸 좌표 찾기
    empty = []
    for i in range(N):
        for j in range(M):
            if arr[i][j] == 0:
                empty.append((i, j))

    # 3개의 벽을 설치하는 모든 경우의수 (브루트포스)
    for i in range(len(empty)):
        for j in range(i+1, len(empty)):
            for k in range(j+1, len(empty)):
                x1, y1 = empty[i]
                x2, y2 = empty[j]
                x3, y3 = empty[k]
                # 벽 세우기
                arr[x1][y1] = arr[x2][y2] = arr[x3][y3] = 1

                # 바이러스 확산
                result = virusBFS(arr, N, M)

                # safeZone 계산
                count = countSafeZone(result, N, M)
                if index < count:
                    index = count

                # 벽 제거
                arr[x1][y1] = arr[x2][y2] = arr[x3][y3] = 0

    return index

print(makeWalls(arr, N, M))