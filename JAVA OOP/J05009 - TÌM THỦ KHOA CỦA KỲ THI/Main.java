import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThuKhoa> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new ThuKhoa(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        double max_diem = a.get(0).getTongdiem();
        for (ThuKhoa x : a) {
            if (x.getTongdiem() == max_diem) {
                System.out.println(x);
            }
        }
    }
}
