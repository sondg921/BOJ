import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static void syncHeap(PriorityQueue<Integer> pq, Map<Integer,Integer> map) {
        while (!pq.isEmpty()) {
            if(map.getOrDefault(pq.peek(), 0) == 0){
                pq.poll();
            }
            else{
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            PriorityQueue<Integer> minPq = new PriorityQueue<>();
            PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
            Map<Integer, Integer> map = new HashMap<>();
            int k = Integer.parseInt(br.readLine());

            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                int n = Integer.parseInt(st.nextToken());
                if (c == 'I'){
                    minPq.offer(n);
                    maxPq.offer(n);
                    map.put(n, map.getOrDefault(n,0)+1);
                }
                else if(c == 'D'){
                    if (map.size() == 0) continue;
                    // 최댓값 삭제
                    if(n == 1){
                        syncHeap(maxPq, map);
                        int delete = maxPq.poll();
                        map.put(delete, map.get(delete)-1);
                        syncHeap(minPq, map);
                        if(map.get(delete) == 0){
                            map.remove(delete);
                        }
                    }
                    // 최솟값 삭제
                    else if(n == -1){
                        syncHeap(minPq, map);
                        int delete = minPq.poll();
                        map.put(delete, map.get(delete)-1);
                        syncHeap(maxPq, map);
                        if(map.get(delete) == 0){
                            map.remove(delete);
                        }
                    }
                }
            }

            syncHeap(maxPq, map);
            syncHeap(minPq, map);

            if(map.size() == 0){
                sb.append("EMPTY").append("\n");
            }
            else{
                sb.append(maxPq.peek()).append(" ").append(minPq.peek()).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}