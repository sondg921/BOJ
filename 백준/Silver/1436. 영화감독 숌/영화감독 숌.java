import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        int num = 666;
        while(list.size() < n){
            String str = Integer.toString(num);
            if(str.contains("666")){
                list.add(Integer.parseInt(str));
            }
            num++;
        }
        System.out.println(num-1);
    }
}