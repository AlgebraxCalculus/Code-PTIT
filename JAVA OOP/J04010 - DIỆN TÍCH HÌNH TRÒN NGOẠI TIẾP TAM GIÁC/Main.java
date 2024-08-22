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
                double p = (d1 + d2 + d3) / 2;
                double s = Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
                double r = d1 * d2 * d3 / (4 * s);
                System.out.printf("%.3f\n", Math.PI * r * r);
            }
        }
    }
}
