import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, n);

        find(size, r, c);

        System.out.println(count);
    }

    private static void find(int size, int r, int c) {
        if (size == 1){
            return;
        }

        int half = size / 2;

        // 1사분면 (왼쪽 위)
        if (r < half && c < half) {
            find(half, r, c);
        }
        // 2사분면 (오른쪽 위)
        else if (r < half && c >= half) {
            count += half * half; // 1사분면 크기만큼 더함
            find(half, r, c - half); // 열 좌표 조정
        }
        // 3사분면 (왼쪽 아래)
        else if (r >= half && c < half) {
            count += (half * half) * 2; // 1, 2사분면 크기 더함
            find(half, r - half, c); // 행 좌표 조정
        }
        // 4사분면 (오른쪽 아래)
        else {
            count += (half * half) * 3; // 1, 2, 3사분면 크기 더함
            find(half, r - half, c - half); // 행, 열 좌표 조정
        }
    }
}
