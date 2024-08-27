import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BangDiem[] a = new BangDiem[n];
        for (int i = 0; i < n; i++) {
            a[i] = new BangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for (BangDiem x : a) {
            System.out.println(x);
        }
    }
}
