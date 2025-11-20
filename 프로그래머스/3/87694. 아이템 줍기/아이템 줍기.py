from collections import deque


def solution(rectangle, characterX, characterY, itemX, itemY):
    # 좌표를 2배 확대
    board = [[0] * 102 for _ in range(102)]

    # 1) 사각형 전체 영역을 먼저 1로 표시
    for x1, y1, x2, y2 in rectangle:
        x1 *= 2
        y1 *= 2
        x2 *= 2
        y2 *= 2
        for x in range(x1, x2 + 1):
            for y in range(y1, y2 + 1):
                board[x][y] = 1

    # 2) 사각형 내부 영역을 0으로 비워서 테두리만 남기기
    for x1, y1, x2, y2 in rectangle:
        x1 *= 2
        y1 *= 2
        x2 *= 2
        y2 *= 2
        for x in range(x1 + 1, x2):
            for y in range(y1 + 1, y2):
                board[x][y] = 0

    # BFS 탐색
    q = deque()
    visited = [[False] * 102 for _ in range(102)]

    # 시작점 역시 2배로
    sx, sy = characterX * 2, characterY * 2
    ex, ey = itemX * 2, itemY * 2

    q.append((sx, sy, 0))
    visited[sx][sy] = True

    directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

    while q:
        x, y, dist = q.popleft()

        # 아이템 도착
        if x == ex and y == ey:
            return dist // 2  # 2배 좌표이므로 실제 거리는 /2

        for dx, dy in directions:
            nx = x + dx
            ny = y + dy
            if 0 <= nx < 102 and 0 <= ny < 102:
                if board[nx][ny] == 1 and not visited[nx][ny]:
                    visited[nx][ny] = True
                    q.append((nx, ny, dist + 1))