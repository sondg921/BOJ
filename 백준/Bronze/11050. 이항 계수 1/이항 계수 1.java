import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(fac(n) / (fac(n-k)*fac(k)));
    }

    public static int fac(int n){
        int index = 1;
        for(int i = 1; i <= n; i++){
            index *= i;
        }
        return index;
    }
}