import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n = Integer.parseInt(sc.nextLine());
            Student[] a = new Student[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            }
            for (Student x : a) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
