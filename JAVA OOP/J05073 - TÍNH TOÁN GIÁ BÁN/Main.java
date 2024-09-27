import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] a = new Product[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Product(sc.next(), sc.nextInt(), sc.nextInt());
            a[i].setThue();
            a[i].setPhivc();
            a[i].setTongtien();
        }
        for (Product x : a) {
            System.out.println(x);
        }
    }
}
