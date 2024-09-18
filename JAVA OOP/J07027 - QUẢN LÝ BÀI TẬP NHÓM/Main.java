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
                a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            sc = new Scanner(new File("BAITAP.in"));
            int m = Integer.parseInt(sc.nextLine());
            String[] bt = new String[m];
            for (int i = 0; i < m; i++) {
                bt[i] = sc.nextLine();
            }
            sc = new Scanner(new File("NHOM.in"));
            ArrayList<Nhom> c = new ArrayList<>();
            while (sc.hasNext()) {
                String maSV = sc.next();
                int maNhom = Integer.parseInt(sc.next());
                String tenBT = bt[maNhom - 1];
                Nhom tmp = new Nhom(maSV, maNhom, tenBT);
                for (SinhVien x : a) {
                    if (x.getMa().equals(maSV)) {
                        tmp.setTenSV(x.getTen());
                        tmp.setSdtSV(x.getSdt());
                    }
                }
                c.add(tmp);
            }
            Collections.sort(c);
            for (Nhom x : c) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
