import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        int rank = 1;
        a.get(0).setThu_hang(rank);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).getDiemTB() != a.get(i - 1).getDiemTB()) {
                rank = i + 1;
            }
            a.get(i).setThu_hang(rank);
        }
        a.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (Student x : a) {
            System.out.println(x);
        }
    }
}
