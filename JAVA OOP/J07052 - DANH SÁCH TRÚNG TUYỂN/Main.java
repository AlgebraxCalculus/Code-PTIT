import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<ThiSinh> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
            }
            Collections.sort(a);
            int k = Integer.parseInt(sc.nextLine());
            double diem_chuan = a.get(k - 1).getTong_diem();
            System.out.printf("%.1f\n", diem_chuan);
            for (ThiSinh x : a) {
                if (x.getTong_diem() < diem_chuan) {
                    System.out.println(x + " " + "TRUOT");
                } else {
                    System.out.println(x + " " + "TRUNG TUYEN");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
