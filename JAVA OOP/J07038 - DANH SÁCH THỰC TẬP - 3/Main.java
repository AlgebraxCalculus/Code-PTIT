import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
            int n = Integer.parseInt(sc1.nextLine());
            ArrayList<SinhVien> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
            }
            Collections.sort(a);
            Scanner sc2 = new Scanner(new File("DN.in"));
            int m = Integer.parseInt(sc2.nextLine());
            DoanhNghiep[] b = new DoanhNghiep[m];
            for (int i = 0; i < m; i++) {
                b[i] = new DoanhNghiep(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()));
            }
            Scanner sc3 = new Scanner(new File("THUCTAP.in"));
            int p = sc3.nextInt();
            ArrayList<ThucTap> c = new ArrayList<>();
            for (int i = 0; i < p; i++) {
                c.add(new ThucTap(sc3.next(), sc3.next()));
            }
            Collections.sort(c);
            int q = sc3.nextInt();
            while (q --> 0) {
                String s = sc3.next();
                String name = "";
                int cnt = 0;
                for (DoanhNghiep x : b) {
                    if (x.getMa().equals(s)) {
                        name = x.getTen();
                        cnt = x.getSo_sv();
                    }
                }
                System.out.println("DANH SACH THUC TAP TAI " + name + ":");
                for (ThucTap x : c) {
                    if (x.getMaDN().equals(s)) {
                        for (SinhVien y : a) {
                            if (x.getMaSV().equals(y.getMa())) {
                                System.out.println(y);
                                cnt--;
                            }
                            if (cnt == 0) {
                                break;
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
