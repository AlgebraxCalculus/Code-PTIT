import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Product(sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        for (Product x : a) {
            System.out.println(x);
        }
    }
}
