import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String ma = s.substring(0, 7);
            String ten = s.substring(8);
            a.add(new Employee(ma, ten));
        }
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String s = sc.nextLine().toLowerCase();
            for (Employee x : a) {
                if (x.getTen().toLowerCase().contains(s)) {
                    System.out.println(x);
                }
            }
            System.out.println();
        }
    }
}
