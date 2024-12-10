import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        ArrayList<SinhVien> a = new ArrayList<>();
        ArrayList<SinhVien> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String[] ss = sc.nextLine().split("\\s+");
            double gpa = Double.parseDouble(ss[0]);
            double drl = Double.parseDouble(ss[1]);
            SinhVien sv = new SinhVien(ten, gpa, drl);
            a.add(sv);
            b.add(sv);
        }
        Collections.sort(a);
        double diemChuan = a.get(m - 1).getGpa();
        for (SinhVien x : b) {
            if (x.getGpa() < diemChuan) {
                x.setTrangThai();
            }
            System.out.println(x);
        }
    }
}
