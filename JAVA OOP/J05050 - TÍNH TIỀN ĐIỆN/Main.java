import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TienDien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new TienDien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for (TienDien x : a) {
            System.out.println(x);
        }
    }
}
