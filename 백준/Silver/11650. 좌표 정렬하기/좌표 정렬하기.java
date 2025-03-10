import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class dot{
    int x;
    int y;

    dot(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //베열 입력
        dot[] arr = new dot[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new dot(sc.nextInt(), sc.nextInt());
        }

        //정렬
        Arrays.sort(arr, (o1, o2) -> {
                if(o1.x == o2.x)
                {
                    return o1.y - o2.y;
                }
                return o1.x - o2.x;
        });

        //출력
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
