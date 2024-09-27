import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        Hotel[] a = new Hotel[n];
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split("\\s+");
            a[i] = new Hotel(s[0], s[1], Integer.parseInt(s[2]), Double.parseDouble(s[3]));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String ten = sc.nextLine();
            String phong = sc.nextLine();
            String ngay_den = sc.nextLine();
            String ngay_di = sc.nextLine();
            int don_gia = 0;
            double phi_pv = 0;
            for (Hotel x : a) {
                if (phong.charAt(2) == x.getMa().charAt(0)) {
                    don_gia = x.getDon_gia_ngay();
                    phi_pv = x.getPhi_phuc_vu();
                    break;
                }
            }
            b.add(new Customer(ten, phong, ngay_den, ngay_di, don_gia, phi_pv));
        }
        Collections.sort(b);
        for (Customer x : b) {
            System.out.println(x);
        }
    }
}
