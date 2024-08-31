import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new DonHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        for (DonHang x : a) {
            System.out.println(x);
        }
    }
}
