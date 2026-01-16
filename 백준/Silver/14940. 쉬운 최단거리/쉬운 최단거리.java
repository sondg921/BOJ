import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[][] arr;
    static int[][] visited;
    static int[][] dist;
    static Queue<int[]> q = new LinkedList<>();
    static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    static void bfs(int x, int y) {
        q.add(new int[] {x, y});
        visited[x][y] = 1;
        dist[x][y] = 0;

        while (!q.isEmpty()) {
            int[] v = q.poll();
            for (int[] d : direction) {
                int[] newV = new int[] {v[0] + d[0], v[1] + d[1]};
                if (newV[0] >= 0 && newV[0] < n && newV[1] >= 0 && newV[1] < m && visited[newV[0]][newV[1]] == 0) {
                    if (arr[newV[0]][newV[1]] == 1){
                        q.add(new int[] {newV[0], newV[1]});
                        visited[newV[0]][newV[1]] = 1;
                        dist[newV[0]][newV[1]] = dist[v[0]][v[1]] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new int[n][m];
        dist = new int[n][m];

        int x= 0; int y = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = 0;
                dist[i][j] = -1;
                if (arr[i][j] == 2){
                    x = i;
                    y = j;
                }
                else if (arr[i][j] == 0){
                    dist[i][j] = 0;
                }
            }
        }

        bfs(x, y);
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sb.append(dist[i][j]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
