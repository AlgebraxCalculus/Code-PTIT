import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt(), sc.next());
        r.solve();
    }
}
