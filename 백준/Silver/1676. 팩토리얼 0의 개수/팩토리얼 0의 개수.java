import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int c = 0;
        while (n >=5){
            c += n / 5;
            n /= 5;
        }

        System.out.println(c);
    }
}