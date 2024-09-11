import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String ma_pb = sc.next();
            String ten_pb = sc.nextLine();
            mp.put(ma_pb, ten_pb);
        }
        int m = Integer.parseInt(sc.nextLine());
        Employee[] a = new Employee[m];
        for (int i = 0; i < m; i++) {
            a[i] = new Employee(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            if (mp.containsKey(a[i].getMa_phong())) {
                a[i].setTen_phong(mp.get(a[i].getMa_phong()));
            }
        }
        for (Employee x : a) {
            System.out.println(x);
        }
    }
}
