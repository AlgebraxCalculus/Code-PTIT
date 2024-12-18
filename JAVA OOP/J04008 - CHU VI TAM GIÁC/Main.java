import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double d1 = a.Distance(b);
            double d2 = b.Distance(c);
            double d3 = a.Distance(c);
            if (d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) {
                System.out.println("INVALID");
            } else {
                System.out.printf("%.3f\n", d1 + d2 + d3);
            }
        }
    }
}
