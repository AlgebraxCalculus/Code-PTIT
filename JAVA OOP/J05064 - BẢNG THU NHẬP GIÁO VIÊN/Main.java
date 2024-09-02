import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Teacher(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        int cntHT = 0, cntHP = 0;
        for (Teacher x : a) {
            if (x.getCv().equals("HT")) {
                cntHT++;
                if (cntHT <= 1) {
                    System.out.println(x);
                }
            } else if (x.getCv().equals("HP")) {
                cntHP++;
                if (cntHP <= 2) {
                    System.out.println(x);
                }
            } else {
                System.out.println(x);
            }
        }
    }
}
