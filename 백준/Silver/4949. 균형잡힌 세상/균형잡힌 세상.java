import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            if (str.equals(".")){
                break;
            }

            list.add(str);
        }

        for (String str : list) {
            String[] arr = str.split("");
            ArrayList<String> charList = new ArrayList<>(Arrays.asList(arr));
            Stack<String> stack = new Stack<>();
            boolean flag = true;

            for (String ch : charList) {
                if (ch.equals("[") || ch.equals("(")) {
                    stack.push(ch);
                }
                else if (ch.equals("]")) {
                    if (stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    String top = stack.pop();
                    if (!top.equals("[")) {
                        flag = false;
                        break;
                    }
                }
                else if (ch.equals(")")) {
                    if (stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    String top = stack.pop();
                    if (!top.equals("(")) {
                        flag = false;
                        break;
                    }
                }
            }
            if (stack.isEmpty() && flag) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
