import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
        TheLoai[] a = new TheLoai[n];
        for (int i = 0; i < n; i++) {
            a[i] = new TheLoai(sc.nextLine());
        }
        ArrayList<Film> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String maTL = sc.nextLine();
            String ngay_chieu = sc.nextLine();
            String ten = sc.nextLine();
            int so_tap = Integer.parseInt(sc.nextLine());
            String the_loai = "";
            for (TheLoai x : a) {
                if (x.getMa().equals(maTL)) {
                    the_loai = x.getTen();
                    break;
                }
            }
            b.add(new Film(ngay_chieu, ten, so_tap, the_loai));  
        }
        Collections.sort(b);
        for (Film i : b) {
            System.out.println(i);
        }
    }
}
