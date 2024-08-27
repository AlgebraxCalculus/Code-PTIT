import java.util.Scanner;

public class Main {
    private static String chuanhoa (String s) {
        String[] ss = s.split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase();
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] a = new GiangVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new GiangVien(sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String s = chuanhoa(sc.nextLine());
            System.out.println("DANH SACH GIANG VIEN BO MON " + s + ":");
            for (GiangVien x : a) {
                if (x.getBomon().equals(s)) {
                    System.out.println(x);
                }
            }
        }
    }
}
