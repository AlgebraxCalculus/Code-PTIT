import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getLop().equals(o2.getLop())) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o1.getLop().compareTo(o2.getLop());
            }
        });
        for (Student i : a) {
            System.out.println(i);
        }
    }
}
