import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("SV.in");
        try {
            Scanner sc = new Scanner(f);
            int n = Integer.parseInt(sc.nextLine());
            Student[] a = new Student[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            }
            for (Student s : a) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
