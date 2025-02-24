import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();

        char[] arr = sc.next().toCharArray();

        System.out.println(H(L, arr));
	}

    public static long H(int L, char[] arr){
        long index = 1;
        long sum = 0;
        for(int i = 0; i < L; i++){
            int n = arr[i];
            sum += (n - 96) * index;
            index = (index * 31) % 1234567891;
        }

        return sum % 1234567891;
    }
}