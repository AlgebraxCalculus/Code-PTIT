import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            Point[] a = new Point[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Point(0, 0);
                a[i].nextPoint(sc);
            }
            double res = 0;
            for (int i = 1; i < n - 1; i++) {
                res += Point.Area(a[0], a[i], a[i + 1]);
            }
            res = 0.5 * Math.abs(res);
            System.out.printf("%.3f\n", res);
        }
    }
}
