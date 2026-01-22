import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    static int M, N, H; // 가로, 세로, 높이
    static int[][][] board;
    
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        board = new int[H][N][M];
        
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    board[k][i][j] = Integer.parseInt(st.nextToken());
                    if (board[k][i][j] == 1) {
                        q.add(new int[]{k, i, j});
                    }
                }
            }
        }
        
        System.out.println(bfs());
    }

    static int bfs() {
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int z = cur[0];
            int x = cur[1];
            int y = cur[2];

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nz < 0 || nx >= N || ny >= M || nz >= H) {
                    continue;
                }
                
                if (board[nz][nx][ny] == 0) {
                    board[nz][nx][ny] = board[z][x][y] + 1;
                    q.add(new int[]{nz, nx, ny});
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (board[k][i][j] == 0) {
                        return -1;
                    }
                    max = Math.max(max, board[k][i][j]);
                }
            }
        }
        
        if (max == -1) return 0;

        return max - 1;
    }
}