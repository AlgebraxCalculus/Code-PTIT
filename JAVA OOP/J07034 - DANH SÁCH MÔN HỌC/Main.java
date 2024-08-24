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
            Subject[] a = new Subject[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            }
            Arrays.sort(a, new Comparator<Subject>() {
                @Override
                public int compare(Subject o1, Subject o2) {
                    return o1.getTen_mon().compareTo(o2.getTen_mon());
                }
            });
            for (Subject i : a) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
