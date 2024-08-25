import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("KHACH.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<Customer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            Collections.sort(a);
            for (Customer i : a) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
