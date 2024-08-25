import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = Integer.parseInt(sc.nextLine());
            MonThi[] a = new MonThi[n];
            for (int i = 0; i < n; i++) {
                a[i] = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Arrays.sort(a, new Comparator<MonThi>() {
                @Override
                public int compare(MonThi o1, MonThi o2) {
                    return o1.getMa_mon().compareTo(o2.getMa_mon());
                }
            });
            for (MonThi i : a) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
