import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); //몸무게
            arr[i][1] = sc.nextInt(); //키
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) count++;
            }
            System.out.print(count + 1 + " ");
        }
    }
}