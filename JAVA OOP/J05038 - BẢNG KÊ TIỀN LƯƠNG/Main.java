import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TienLuong> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new TienLuong(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        long s = 0;
        for (TienLuong x : a) {
            s += x.getThuclinh();
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: " + s);
    }
}
