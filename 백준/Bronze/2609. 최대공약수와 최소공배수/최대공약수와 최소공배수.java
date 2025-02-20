import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(MaxDivisor(a, b));
        System.out.println(LeastMultiple(a, b));
    }

    public static int MaxDivisor(int a, int b){
        int high, low;
        if(a < b){
            high = b;
            low = a;
        }
        else{
            high = a;
            low = b;
        }
        for(int i = low; i >= 1; i--){
            if(high % i == 0 && low % i == 0)
                return i;
        }
        return 0;
    }

    public static int LeastMultiple(int a, int b){
        int high, low;
        if(a < b){
            high = b;
            low = a;
        }
        else{
            high = a;
            low = b;
        }
        for(int i = high; i <= a * b; i += high){
            if(i % low == 0)
                return i;
        }
        return 0;
    }
}