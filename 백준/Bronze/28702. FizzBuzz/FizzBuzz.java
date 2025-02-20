import java.util.Scanner;

class Main {
    public static void FizzBuzz(int i){
        if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
        else if(i%3 == 0 && i%5 != 0){
                System.out.println("Fizz");
            }
        else if(i%3 != 0 && i%5 == 0){
                System.out.println("Buzz");
            }
        else
            System.out.println(i);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String st1 = sc.nextLine();
        int ascii1 = (int)st1.charAt(0);
       
        String st2 = sc.nextLine();
        int ascii2 = (int)st2.charAt(0);
       
        String st3 = sc.nextLine();
        int ascii3 = (int)st3.charAt(0);

        int[] arr = new int[3];
        arr[0] = ascii1;
        arr[1] = ascii2;
        arr[2] = ascii3;

        int j = 0;
        int r = 0;
        if(ascii1 != 66 && ascii1 != 70 && ascii1 >= 49 && ascii1 <= 57){
            j = ascii1;
            r = Integer.parseInt(st1) + 3;
        }
        if(ascii2 != 66 && ascii2 != 70 && ascii2 >= 49 && ascii2 <= 57){
            j = ascii2;
            r = Integer.parseInt(st2) + 2;
        }
        if(ascii3 != 66 && ascii3 != 70 && ascii3 >= 49 && ascii3 <= 57){
            j = ascii3;
            r = Integer.parseInt(st3) + 1;
        }
       
        FizzBuzz(r);
    }
}