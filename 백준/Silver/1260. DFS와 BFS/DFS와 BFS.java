import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static Queue<Integer> queue = new ArrayDeque<>();
    static int n;
    static int m;
    static int v;

    public static void makeGraph(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        graph = new ArrayList[n + 1];
        visited = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
            visited[i] = false;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }
    }

    static void dfs(int node) {
        if (!visited[node]) {
            visited[node] = true;
            System.out.print(node+" ");
        }

        for (int nextNode : graph[node]) {
            if(!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }

    static void visitedInit() {
        for (int i = 1; i <= n; i++) {
            visited[i] = false;
        }
    }

    static void bfs(int node){
        queue.add(node);
        while (!queue.isEmpty()) {
            int pop = queue.remove();
            if (!visited[pop]) {
                visited[pop] = true;
                System.out.print(pop + " ");
            }
            for (int nextNode : graph[pop]) {
                if(!visited[nextNode]) {
                    queue.add(nextNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        makeGraph();

        dfs(v);

        System.out.println();
        visitedInit();

        bfs(v);
    }
}
