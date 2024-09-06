import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.next();
            String ten = sc.nextLine().trim();
            a.add(new Employee(ma, ten));
            a.get(i).setChucvu();
            a.get(i).setBac_luong();
            a.get(i).setSo_hieu();
        }
        Collections.sort(a);
        int q = sc.nextInt();
        while (q --> 0) {
            String s = sc.next();
            for (Employee x : a) {
                if (x.getChucvu().equals(s)) {
                    System.out.println(x);
                }
            }
            System.out.println();
        }
    }
}
