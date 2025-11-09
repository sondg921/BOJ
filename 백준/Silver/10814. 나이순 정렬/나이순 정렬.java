import java.util.*;

public class Main {
    public static void main(String[] args) {
        class Member{
            int age;
            String name;
            int index;

            public Member(int age, String name, int index) {
                this.age = age;
                this.name = name;
                this.index = index;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Member> pq = new PriorityQueue<>(
                (m1, m2) -> {
                    if(m1.age != m2.age){
                        return Integer.compare(m1.age, m2.age);
                    }
                    return Integer.compare(m1.index, m2.index);
                }
        );

        for(int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            Member member = new Member(age, name, i);
            pq.add(member);
        }

        for (int i = 0; i < n; i++) {
            Member m = pq.poll();
            System.out.printf("%d %s\n", m.age, m.name);
        }
    }
}
