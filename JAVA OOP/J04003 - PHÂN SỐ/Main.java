import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f = new Fraction(sc.nextLong(), sc.nextLong());
        f.simplify();
        System.out.println(f);
    }
}
