import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String dob = sc.nextLine();
            Double hieuSuat = Double.valueOf(sc.nextLine());
            Double trachNhiem = Double.valueOf(sc.nextLine());
            a.add(new Employee(ten, dob, hieuSuat, trachNhiem));
        }
        Collections.sort(a);
        for (Employee x : a) {
            if (x.getHieuSuatCV() < 6 && x.getTrachNhiemCV() < 60) {
                System.out.println(x);
            }
        }
    }
}
