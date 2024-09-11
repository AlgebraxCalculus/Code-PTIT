import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Product[] a = new Product[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Product(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int m = Integer.parseInt(sc.nextLine());
        while (m --> 0) {
            String[] s = sc.nextLine().split("\\s+");
            for (Product x : a) {
                if (x.getMa().equals(s[0])) {
                    x.setSl_nhap(Integer.parseInt(s[1]));
                    x.setGia_nhap(Integer.parseInt(s[2]));
                    x.setSl_xuat(Integer.parseInt(s[3]));
                    x.updateTong();
                    System.out.println(x);
                }
            }
        }
    }
}
