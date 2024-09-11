import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Racer[] a = new Racer[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Racer(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<Racer>() {
            @Override
            public int compare(Racer o1, Racer o2) {
                return Double.compare(o2.getVantoc(), o1.getVantoc());
            }
        });
        for (Racer x : a) {
            System.out.println(x);
        }
    }
}
