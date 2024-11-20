import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine(); 
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            a.add(new SinhVien(ma, ten, lop, email, sdt));
        }
        sc = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HuongDan> b = new ArrayList<>();
        while (n --> 0) {
            String[] s = sc.nextLine().split("\\s+");
            String tenGV = String.join(" ", Arrays.copyOf(s, s.length - 1));
            int sl = Integer.parseInt(s[s.length - 1]);
            while (sl --> 0) {
                String maSV = sc.next();
                String tenDA = sc.nextLine();
                String tenSV = "", sdt = "";
                for (SinhVien x : a) {
                    if (maSV.equals(x.getMa())) {
                        tenSV = x.getTen();
                        sdt = x.getSdt();
                        break;
                    }
                }
                b.add(new HuongDan(maSV, tenSV, sdt, tenGV, tenDA));
            }
        }
        Collections.sort(b);
        for (HuongDan x : b) {
            System.out.println(x);
        }
    }
}
