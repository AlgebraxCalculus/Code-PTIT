import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            Fraction A = new Fraction(sc.nextInt(), sc.nextInt());
            Fraction B = new Fraction(sc.nextInt(), sc.nextInt());
            Fraction.process(A, B);
        }
    }
}
