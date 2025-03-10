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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //베열 입력
        dot[] arr = new dot[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new dot(sc.nextInt(), sc.nextInt());
        }

        //정렬
        Arrays.sort(arr, new Comparator<dot>() {
            @Override
            public int compare(dot o1, dot o2) {
                if(o1.y == o2.y)
                {
                    return o1.x - o2.x;
                }
                return o1.y - o2.y;
            }
        });

        //출력
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
