import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] a = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        sc = new Scanner(new File("DETAI.in"));
        int m = Integer.parseInt(sc.nextLine());
        DeTai[] b = new DeTai[m];
        for (int i = 0; i < m; i++) {
            b[i] = new DeTai(sc.nextLine(), sc.nextLine());
        }
        sc = new Scanner(new File("NHIEMVU.in"));
        int p = sc.nextInt();
        ArrayList<NhiemVu> c = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            String maSV = sc.next();
            String maDT = sc.next();
            String tenSV = "", sdtSV = "", emailSV = "", tenGV = "", tenDT = "";
            for (SinhVien x : a) {
                if (maSV.equals(x.getMa())) {
                    tenSV = x.getTen();
                    sdtSV = x.getSDT();
                    emailSV = x.getEmail();
                    break;
                }
            }
            for (DeTai y : b) {
                if (maDT.equals(y.getMaDT())) {
                    tenGV = y.getTenGV();
                    tenDT = y.getTenDT();
                    break;
                }
            }
            c.add(new NhiemVu(maSV, tenSV, sdtSV, emailSV, tenGV, tenDT));
        }
        Collections.sort(c);
        for (NhiemVu x : c) {
            System.out.println(x);
        }
    }
}
