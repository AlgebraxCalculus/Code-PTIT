import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n = Integer.parseInt(sc.nextLine());
            SinhVien[] a = new SinhVien[n];
            for (int i = 0; i < n; i++) {
                a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            sc = new Scanner(new File("MONHOC.in"));
            int m = Integer.parseInt(sc.nextLine());
            MonHoc[] b = new MonHoc[m];
            for (int i = 0; i < m; i++) {
                b[i] = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            }
            sc = new Scanner(new File("BANGDIEM.in"));
            int p = sc.nextInt();
            ArrayList<BangDiem> c = new ArrayList<>();
            for (int i = 0; i < p; i++) {
                c.add(new BangDiem(sc.next(), sc.next(), Float.parseFloat(sc.next())));
                for (SinhVien x : a) {
                    if (x.getMa().equals(c.get(i).getMaSV())) {
                        c.get(i).setTenSV(x.getTen());
                        c.get(i).setLopSV(x.getLop());
                    }
                }
            }
            Collections.sort(c);
            int q = sc.nextInt();
            while (q --> 0) {
                String s = sc.next();
                String name = "";
                for (MonHoc x : b) {
                    if (s.equals(x.getMa())) {
                        name = x.getTen();
                    }
                }
                System.out.println("BANG DIEM MON " + name + ":");
                for (BangDiem x : c) {
                    if (x.getMaMon().equals(s)) {
                        System.out.println(x);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
