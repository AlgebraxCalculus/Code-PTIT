import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        int x = sc.nextInt();
        double diem_chuan = a.get(x - 1).getTong_diem();
        System.out.println(diem_chuan);
        for (Student i : a) {
            if (i.getTong_diem() < diem_chuan) {
                System.out.println(i + " " + "TRUOT");
            } else {
                System.out.println(i + " " + "TRUNG TUYEN");
            }
        }
    }
}
