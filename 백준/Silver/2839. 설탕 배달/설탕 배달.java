import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = -1;
        for (int i = n / 5; i >= 0; i--) {
            int rest = n - 5*i;
            if (rest % 3 == 0) {
                int index = rest / 3;
                sum = i + index;
                System.out.println(sum);
                break;
            }
        }

        if (sum == -1){
            System.out.println(sum);
        }
    }
}
