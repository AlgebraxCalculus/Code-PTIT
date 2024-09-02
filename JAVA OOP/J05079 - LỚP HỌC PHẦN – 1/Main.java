import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String ma = sc.nextLine();
            String name = "";
            for (Subject x : a) {
                if (x.getMa().equals(ma)) {
                    name = x.getTen();
                }
            }
            System.out.println("Danh sach nhom lop mon " + name + ":");
            for (Subject x : a) {
                if (x.getMa().equals(ma)) {
                    System.out.println(x);
                }
            }
        }
    }
}
