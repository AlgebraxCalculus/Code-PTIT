import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction s = a.add(b);
        System.out.println(s);
    }
}
