import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc1 = new Scanner(new File("MONHOC.in"));
            Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
            Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
            int n = Integer.parseInt(sc1.nextLine());
            ArrayList<MonHoc> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new MonHoc(sc1.next(), sc1.nextLine()));
            }
            int m = Integer.parseInt(sc2.nextLine());
            ArrayList<GiangVien> b = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                b.add(new GiangVien(sc2.next(), sc2.nextLine()));
            }
            int p = Integer.parseInt(sc3.nextLine());
            while (p --> 0) {
                String maGV = sc3.next();
                String maMH = sc3.next();
                Double time = sc3.nextDouble();
                for (GiangVien x : b) {
                    if (x.getMa().equals(maGV)) {
                        x.setTime(time);
                    }
                }
            }
            for (GiangVien x : b) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
