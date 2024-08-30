import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThuNhap> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new ThuNhap(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for (ThuNhap x : a) {
            System.out.println(x);
        }
    }
}
