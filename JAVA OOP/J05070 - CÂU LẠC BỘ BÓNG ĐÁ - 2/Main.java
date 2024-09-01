import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Club[] a = new Club[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Club(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Match> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] ss = sc.nextLine().split("\\s+");
            String ma = ss[0];
            int sl_cdv = Integer.parseInt(ss[1]);
            String tendoi = "";
            int gia_ve = 0;
            for (int j = 0; j < n; j++) {
                if (ma.substring(1, 3).equals(a[j].getMa())) {
                    tendoi = a[j].getTen();
                    gia_ve = a[j].getGiave();
                    break;
                }
            }
            b.add(new Match(ma, tendoi, sl_cdv * gia_ve));
        }
        Collections.sort(b);
        for (Match x : b) {
            System.out.println(x);
        }
    }
}
