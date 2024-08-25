import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        double diem_chuan = 24;
        if (a.getTong_diem() + a.getDiem_uu_tien() < diem_chuan) {
            System.out.println(a + " " + "TRUOT");
        } else {
            System.out.println(a + " " + "TRUNG TUYEN");
        }
    }
}
