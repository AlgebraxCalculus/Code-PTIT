import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o2.getGpa(), o1.getGpa());
            }
        });
        for (Student i : a) {
            System.out.println(i);
        }
    }
}
