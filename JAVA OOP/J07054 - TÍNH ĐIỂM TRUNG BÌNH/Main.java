import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("BANGDIEM.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<Student> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
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
            for (Student x : a) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
