import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        MonThi[] a = new MonThi[n];
        for (int i = 0; i < n; i++) {
            a[i] = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        sc = new Scanner(new File("CATHI.in"));
        int m = sc.nextInt();
        CaThi[] b = new CaThi[m];
        for (int i = 0; i < m; i++) {
            b[i] = new CaThi(sc.next(), sc.next(), sc.next());
        }
        sc = new Scanner(new File("LICHTHI.in"));
        int p = sc.nextInt();
        ArrayList<LichThi> c = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            String maThi = sc.next();
            String maMon = sc.next();
            String maNhom = sc.next();
            int soSV = sc.nextInt();
            String ngayThi = "", gioThi = "", idThi = "", tenMon = "";
            for (MonThi x : a) {
                if (maMon.equals(x.getMaMon())) {
                    tenMon = x.getTenMon();
                    break;
                }
            }
            for (CaThi y : b) {
                if (maThi.equals(y.getMa())) {
                    ngayThi = y.getNgay();
                    gioThi = y.getGio();
                    idThi = y.getId();
                    break;
                }
            }
            c.add(new LichThi(maThi, maMon, maNhom, soSV, ngayThi, gioThi, idThi, tenMon));
        }
        Collections.sort(c);
        for (LichThi x : c) {
            System.out.println(x);
        }
    }
}
