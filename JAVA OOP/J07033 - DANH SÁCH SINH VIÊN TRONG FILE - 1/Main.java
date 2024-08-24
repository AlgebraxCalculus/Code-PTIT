import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("SINHVIEN.in");
        try {
            Scanner sc = new Scanner(f);
            int n = Integer.parseInt(sc.nextLine());
            Student[] a = new Student[n];
            for (int i = 0; i < n; i++) {
             a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Arrays.sort(a, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getId().compareTo(o2.getId());
                }
            });
            for (Student s : a) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
