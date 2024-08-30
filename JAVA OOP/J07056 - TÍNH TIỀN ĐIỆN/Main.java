import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<TienDien> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String ten = sc.nextLine();
                String[] ss = sc.nextLine().split("\\s+");
                String loai = ss[0];
                int dau = Integer.parseInt(ss[1]);
                int cuoi = Integer.parseInt(ss[2]);
                a.add(new TienDien(ten, loai, dau, cuoi));
            }
            Collections.sort(a);
            for (TienDien x : a) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
