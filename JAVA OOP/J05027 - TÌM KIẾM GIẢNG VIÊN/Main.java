import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] a = new GiangVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new GiangVien(sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for (GiangVien x : a) {
                if (x.getTen().toLowerCase().contains(s.toLowerCase())) {
                    System.out.println(x);
                }
            }
        }
    }
}
