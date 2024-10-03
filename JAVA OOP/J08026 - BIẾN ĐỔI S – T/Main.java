import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static int solve (int s, int t) {
        Queue<Pair> q = new LinkedList<>();
        Set<Integer> se = new HashSet<>();
        q.add(new Pair(s, 0));
        while (!q.isEmpty()) {
            Pair top = q.peek();
            q.remove();
            if (top.getFirst() == t) {
                return top.getSecond();
            }
            if (top.getFirst() * 2 == t || top.getFirst() - 1 == t) {
                return top.getSecond() + 1;
            }
            if (!se.contains(top.getFirst() * 2) && top.getFirst() < t) {
                q.add(new Pair(top.getFirst() * 2, top.getSecond() + 1));
                se.add(top.getFirst() * 2);
            }
            if (!se.contains(top.getFirst() - 1) && top.getFirst() > 1) {
                q.add(new Pair(top.getFirst() - 1, top.getSecond() + 1));
                se.add(top.getFirst() - 1);
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test --> 0) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            System.out.println(solve(s, t));
        }
    }
}
