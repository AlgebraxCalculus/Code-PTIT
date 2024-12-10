import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DangKyAo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] a = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        sc = new Scanner(new File("DANGKY.in"));
        ArrayList<Ao> b = new ArrayList<>();
        while (sc.hasNext()) {
            String maSV = sc.next();
            String size = sc.next();
            for (SinhVien x : a) {
                if (maSV.equals(x.getMa())) {
                    b.add(new Ao(x, size));
                    break;
                }
            }
        }
        Collections.sort(b);
        sc = new Scanner(new File("TRUYVAN.in"));
        int p = sc.nextInt();
        while (p --> 0) {
            String gt = sc.next();
            String size = sc.next();
            System.out.println("DANH SACH SINH VIEN " + gt.toUpperCase() + " DANG KY SIZE " + size);
            for (Ao y : b) {
                if (gt.equals(y.getGioiTinh()) && size.equals(y.getSize())) {
                    System.out.println(y);
                }
            }
        }
    }
}
