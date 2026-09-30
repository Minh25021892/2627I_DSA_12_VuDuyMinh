import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hangcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                queue.add(x);
            } else if (type == 2) {
                queue.remove();
            } else if (type == 3) {
                System.out.println(queue.peek());
            }
        }
    }
}