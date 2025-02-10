import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] oldarr = new String[n];

        for(int i = 0; i < n; i++){
            oldarr[i] = sc.next();
        }

        String[] arr = Arrays.stream(oldarr).distinct().toArray(String[]::new);

        int l = arr.length;
        
        for(int i = 0; i < l-1; i++){
            for(int j = i+1; j < l; j++){
                String str = arr[i];
                if(arr[i].length() > arr[j].length()){
                    arr[i] = arr[j];
                    arr[j] = str;
                }
                else if(arr[i].length() == arr[j].length()){
                    if(arr[i].compareTo(arr[j]) > 0){
                        arr[i] = arr[j];
                        arr[j] = str;
                    }
                }
            }
        }
        

        for(int i = 0; i < l; i++){
            System.out.println(arr[i]);
        }
    }
}