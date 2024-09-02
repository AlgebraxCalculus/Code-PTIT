import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        String[] topic = new String[m];
        for (int i = 0; i < m; i++) {
            topic[i] = sc.nextLine();
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            int nhom = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + nhom + ":");
            for (Student x : a) {
                if (x.getNhom() == nhom) {
                    System.out.println(x);
                }
            }
            System.out.println("Bai tap dang ky: " + topic[nhom - 1]);
        }
    }
}
