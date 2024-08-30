import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BangXepHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String[] ss = sc.nextLine().split("\\s+");
            int so_bai_dung = Integer.parseInt(ss[0]);
            int so_submit = Integer.parseInt(ss[1]);
            a.add(new BangXepHang(ten, so_bai_dung, so_submit));
        }
        Collections.sort(a);
        for (BangXepHang x : a) {
            System.out.println(x);
        }
    }
}
