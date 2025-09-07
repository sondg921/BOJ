import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // m = 10 - (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l) / 10
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        int sum = 0;
        int key = 1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] - '0';
            if (num >= 0 && num <= 9){
                if((i + 1)%2 == 1) //홀수
                    sum += num;
                else //짝수
                    sum += 3 * num;
            }
            else {
                if ((i + 1) % 2 == 1) //홀수
                    key = 1;
                else //짝수
                    key = 2;
            }
        }

        if(sum%10 == 0) System.out.println(0);
        else{
            if(key == 1) // 별이 홀수째에 위치
                System.out.println(10 - sum%10);
            else {
                int num1 = 10 - sum%10;
                for (int i = 0; i < 10; i++) {
                    if((3 * i)%10 == num1){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}