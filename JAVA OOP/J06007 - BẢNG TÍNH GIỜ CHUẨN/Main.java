import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new MonHoc(sc.next(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(new GiangVien(sc.next(), sc.nextLine()));
        }
        int p = Integer.parseInt(sc.nextLine());
        while (p --> 0) {
            String maGV = sc.next();
            String maMH = sc.next();
            Double time = sc.nextDouble();
            for (GiangVien x : b) {
                if (x.getMa().equals(maGV)) {
                    x.setTime(time);
                }
            }
        }
        for (GiangVien x : b) {
            System.out.println(x);
        }
    }
}
