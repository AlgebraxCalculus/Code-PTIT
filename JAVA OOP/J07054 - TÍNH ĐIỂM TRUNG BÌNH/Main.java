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
            System.out.println(a.get(0) + " " + rank);
            for (int i = 1; i < a.size(); i++) {
                if (a.get(i).getDiemTB() != a.get(i - 1).getDiemTB()) {
                    System.out.println(a.get(i) + " " + (rank + 1));
                } else {
                    System.out.println(a.get(i) + " " + rank);
                }
                rank += 1;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
