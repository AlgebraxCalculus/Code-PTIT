import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Company[] a = new Company[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                if (o1.getSo_sv() == o2.getSo_sv()) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getSo_sv() - o1.getSo_sv();
            }
        });
        for (Company x : a) {
            System.out.println(x);
        }
    }
}
