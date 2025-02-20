import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        int i = 1;
        int k = 2;
       
        while(k <= N){
            k += (6 * i);
            i++;
        }

        System.out.println(i);
       
    }
}