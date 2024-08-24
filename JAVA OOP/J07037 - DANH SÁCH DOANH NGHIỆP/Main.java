import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DN.in"));
            int n = Integer.parseInt(sc.nextLine());
            Company[] a = new Company[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            }
            Arrays.sort(a, new Comparator<Company>() {
                @Override
                public int compare(Company o1, Company o2) {
                    return o1.getId().compareTo(o2.getId());
                }
            });
            for (Company i : a) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
