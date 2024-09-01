import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (int i = 0; i < n; i++) {
            String[] ss = sc.nextLine().split("\\s+");
            String ma = ss[0];
            String cc = ss[1];
            for (Student x : a) {
                if (x.getMa().equals(ma)) {
                    x.setDiem(cc);
                }
            }
        }
        String s = sc.nextLine();
        for (Student x : a) {
            if (s.equals(x.getLop())) {
                System.out.println(x);
            }
        }
    }
}
