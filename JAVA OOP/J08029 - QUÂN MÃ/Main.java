import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    private static int BFS (String a, String b) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(a, 0));
        while (!q.isEmpty()) {
            Pair top = q.peek();
            q.remove();
            if (top.getFirst().equals(b)) {
                return top.getSecond();
            }
            for (int k = 0; k < 8; k++) {
                char x = (char) (top.getFirst().charAt(0) + dx[k]);
                char y = (char) (top.getFirst().charAt(1) + dy[k]);
                if (x >= 'a' && x <= 'h' && y >= '1' && y <= '8') {
                    q.add(new Pair("" + x + y, top.getSecond() + 1));
                }
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(BFS(a, b));
        }
    }
}
