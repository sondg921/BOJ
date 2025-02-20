import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int Decomposition_sum(int i){
        int index = i;
        while(i != 0){
            index += (i % 10);
            i = i / 10;
        }
        return index;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int B = 0;
        for(int i = 1; i <= N; i++){
            if(Decomposition_sum(i) == N){
                B++;
                System.out.println(i);
                break;
            }
        }

        if(B == 0)
            System.out.println(0);
    }
}