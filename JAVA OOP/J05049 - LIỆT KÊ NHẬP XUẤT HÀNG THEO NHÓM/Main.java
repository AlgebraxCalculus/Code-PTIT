import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Product(sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        String s = sc.next();
        for (Product x : a) {
            if (x.getMa().charAt(0) == s.charAt(0)) {
                System.out.println(x);
            }
        }
    }
}
