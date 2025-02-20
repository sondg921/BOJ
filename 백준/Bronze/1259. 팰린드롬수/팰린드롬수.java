import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 1;

        while(k == 1){
            String s = sc.next();
            if(s.charAt(0) == '0')
                break;
            else{
                int index = 1;
                char[] arr = s.toCharArray();
                for(int i = 0; i < (arr.length/2) + 1; i++){
                    int end = arr.length-1;
                    if(arr[i] != arr[end-i]){
                        System.out.println("no");
                        index = 0;
                        break;
                    }
                }
                if(index == 1)
                    System.out.println("yes");
            }
        }
    }
}