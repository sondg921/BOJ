import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int Calculation(int arr[], int N){
        int index = N;
        for(int i = 0; i < N; i++){
            if(arr[i] == 1)
                index--;
            for(int j = 2; j < arr[i]; j++){
                if(arr[i] % j ==0){
                    if(arr[i] == 2)
                        break;
                    else{
                        index--;
                        break;
                    }
                }
            }
        }

        return index;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Calculation(arr, N));
    }
}