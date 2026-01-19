import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String command = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String inputArr = br.readLine();

            ArrayDeque<Integer> dq = new ArrayDeque<>();

            String numStr = inputArr.substring(1, inputArr.length() - 1);

            if (n > 0) {
                StringTokenizer st = new StringTokenizer(numStr, ",");
                while (st.hasMoreTokens()) {
                    dq.add(Integer.parseInt(st.nextToken()));
                }
            }

            boolean isReversed = false;
            boolean isError = false;

            for (char c : command.toCharArray()) {
                if (c == 'R') {
                    isReversed = !isReversed;
                }
                else {
                    if (dq.isEmpty()){
                        isError = true;
                        break;
                    }
                    else{
                        if (isReversed) {
                            dq.pollLast();
                        }
                        else {
                            dq.pollFirst();
                        }
                    }
                }
            }

            if (isError) {
                sb.append("error\n");
            }
            else {
                sb.append("[");
                if (!dq.isEmpty()) {
                    if (isReversed) {
                        sb.append(dq.pollLast());
                        while (!dq.isEmpty()) {
                            sb.append(",").append(dq.pollLast());
                        }
                    }
                    else {
                        sb.append(dq.pollFirst());
                        while (!dq.isEmpty()) {
                            sb.append(",").append(dq.pollFirst());
                        }
                    }
                }
                sb.append("]\n");
            }
        }
        System.out.println(sb);
    }
}
