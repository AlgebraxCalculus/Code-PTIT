import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            Complex a = new Complex(sc.nextInt(), sc.nextInt());
            Complex b = new Complex(sc.nextInt(), sc.nextInt());
            Complex sum = Complex.add(a, b);
            Complex result1 = Complex.multiply(sum, a);
            Complex result2 = Complex.multiply(sum, sum);
            result1.print1();
            result2.print2();
        }
    }
}
