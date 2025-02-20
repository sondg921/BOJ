import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        //오름차순 정렬
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                int temp = arr[i];
                if(arr[i] > arr[j])
                {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        int left = sum - 100;

        int i, idx=0, j=0;
        for(i = 0; i < arr.length-1; i ++)
        {
            for(j = i+1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == left) {
                    idx = 1;
                    break;
                }
            }
            if(idx == 1){
                break;
            }
        }

        for(int k = 0; k < arr.length; k++)
        {
            if(k != i && k != j)
            {
                System.out.println(arr[k]);
            }
            else
            {
                continue;
            }
        }
    }
}
