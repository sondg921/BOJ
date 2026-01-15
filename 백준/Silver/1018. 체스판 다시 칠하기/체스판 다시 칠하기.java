import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int board(int n, int m, String[][] arr){
        String startColor = arr[n][m];
        int flag;
        if((n+m) % 2 == 0) {
            flag = 0;
        }
        else{
            flag = 1;
        }
        int count = 0;
        int change = 0;

        // 시작 색 그대로
        for (int i = n; i < n+8 ; i++) {
            for (int j = m; j < m+8 ; j++) {
                // 시작과 색이 같아야 할 때
                if((i+j) % 2 == flag){
                    if (!startColor.equals(arr[i][j])){
                        count++;
                    }
                }
                // 시작과 색이 달라야 할 때
                else{
                    if(startColor.equals(arr[i][j])){
                        count++;
                    }
                }
            }
        }

        // 색 바꾸고 시작
        for (int i = n; i < n+8 ; i++) {
            for (int j = m; j < m+8 ; j++) {
                // 시작과 색이 달라야 할 때
                if((i+j) % 2 == flag){
                    if (startColor.equals(arr[i][j])){
                        change++;
                    }
                }
                // 시작과 색이 같아야 할 때
                else{
                    if(!startColor.equals(arr[i][j])){
                        change++;
                    }
                }
            }
        }

        return Math.min(count, change);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) + "";
            }
        }

        int min = 100;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m-8; j++){
                int val = board(i, j, arr);
                if(val < min){
                    min = val;
                }
            }
        }
        System.out.println(min);
    }
}
