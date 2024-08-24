import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] a = new Time[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.getH() != o2.getH()) {
                    return o1.getH() - o2.getH();
                } else if (o1.getM() != o2.getM()) {
                    return o1.getM() - o2.getM();
                }
                return o1.getS() - o2.getS();
            }
        });
        for (Time x : a) {
            System.out.println(x);
        }
    }
}
