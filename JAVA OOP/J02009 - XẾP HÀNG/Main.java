import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Pair(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (res < a.get(i).getFirst()) {
                res = a.get(i).getFirst() + a.get(i).getSecond();
            } else {
                res += a.get(i).getSecond();
            }
        }
        System.out.println(res);
    }
}
