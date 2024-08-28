import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] a = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            a[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if (o1.getTong_diem() == o2.getTong_diem()) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getTong_diem() - o1.getTong_diem();
            }
        });
        for (ThiSinh x : a) {
            System.out.println(x);
        }
    }
}
