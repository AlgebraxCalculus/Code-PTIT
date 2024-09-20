import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Customer[] a = new Customer[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int m = Integer.parseInt(sc.nextLine());
        Product[] b = new Product[m];
        for (int i = 0; i < m; i++) {
            b[i] = new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        }
        int p = sc.nextInt();
        Receipt[] c = new Receipt[p];
        for (int i = 0; i < p; i++) {
            String maKhach = sc.next();
            String maHang = sc.next();
            long so_luong = Long.parseLong(sc.next());
            c[i] = new Receipt(maKhach, maHang, so_luong);
            for (Customer x : a) {
                if (x.getMa().equals(maKhach)) {
                    c[i].setTenKhach(x.getTen());
                    c[i].setDiachiKhach(x.getDiachi());
                    break;
                }
            }
            for (Product y : b) {
                if (y.getMa().equals(maHang)) {
                    c[i].setTenHang(y.getTen());
                    c[i].setDonviHang(y.getDon_vi());
                    c[i].setTienMua(y.getMua());
                    c[i].setTienBan(y.getBan());
                    break;
                }
            }
            c[i].setTongTien();
        }
        for (Receipt x : c) {
            System.out.println(x);
        }
    }
}
