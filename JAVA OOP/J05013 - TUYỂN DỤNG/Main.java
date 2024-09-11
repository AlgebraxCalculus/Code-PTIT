import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Teacher[] a = new Teacher[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Teacher(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return Double.compare(o2.getTb(), o1.getTb());
            }
        });
        for (Teacher x : a) {
            System.out.println(x);
        }
    }
}
