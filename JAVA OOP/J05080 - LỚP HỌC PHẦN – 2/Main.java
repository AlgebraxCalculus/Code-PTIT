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
            String tenGV = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + tenGV + ":");
            for (Subject x : a) {
                if (x.getTengv().equals(tenGV)) {
                    System.out.println(x);
                }
            }
        }
    }
}
