import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        SanPham[] a = new SanPham[n];
        for (int i = 0; i < n; i++) {
            a[i] = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String ten = sc.nextLine();
            String diachi = sc.nextLine();
            String maSP = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            String ngaymua = sc.nextLine();
            int giaban = 0, thoihan = 0;
            for (SanPham x : a) {
                if (maSP.equals(x.getMa())) {
                    giaban = x.getGiaban();
                    thoihan = x.getThoihan();
                    break;
                }
            }
            b.add(new KhachHang(ten, diachi, maSP, sl, ngaymua, giaban, thoihan));
        }
        Collections.sort(b);
        for (KhachHang x : b) {
            System.out.println(x);
        }
    }
}
