import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
        sc = new Scanner(new File("HOIDONG.in"));
        HashMap<Integer, List<HoiDong>> hd = new HashMap<>();
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            String maSV = sc.next(), maDT = sc.next(), maHD = sc.next();
            String tenSV = "", tenDT = "", tenGV = "";
            for (SinhVien x : a) {
                if (maSV.equals(x.getMa())) {
                    tenSV = x.getTen();
                    break;
                }
            }
            for (DeTai y : b) {
                if (maDT.equals(y.getMaDT())) {
                    tenDT = y.getTenDT();
                    tenGV = y.getTenGV();
                    break;
                }
            }
            int tmp = maHD.charAt(2) - '0';
            hd.putIfAbsent(tmp, new ArrayList<>());
            hd.get(tmp).add(new HoiDong(maHD, maSV, tenSV, tenDT, tenGV));
        }
        for (int i = 0; i < 9; i++) {
            if (hd.containsKey(i)) {
                Collections.sort(hd.get(i));
                System.out.println("DANH SACH HOI DONG " + i + ":");
                for (HoiDong x : hd.get(i)) {
                    System.out.println(x);
                }
            }
        }
    }
}
