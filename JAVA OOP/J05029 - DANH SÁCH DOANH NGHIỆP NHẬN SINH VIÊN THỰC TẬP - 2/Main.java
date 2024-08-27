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
        int q = sc.nextInt();
        while (q --> 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + x + " DEN " + y + " SINH VIEN:");
            for (Company i : a) {
                if (i.getSo_sv() >= x && i.getSo_sv() <= y) {
                    System.out.println(i);
                }
            }
        }
    }
}
