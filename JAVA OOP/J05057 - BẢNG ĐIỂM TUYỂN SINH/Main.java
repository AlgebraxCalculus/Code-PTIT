import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] a = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            a[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        double diem_chuan = 24;
        for (ThiSinh x : a) {
            if (x.getTong_diem() + x.getDiem_uu_tien() < diem_chuan) {
                System.out.println(x + " " + "TRUOT");
            } else {
                System.out.println(x + " " + "TRUNG TUYEN");
            }
        }
    }
}
