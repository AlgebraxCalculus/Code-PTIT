import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<Subject> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
            }
            Collections.sort(a);
            for (Subject x : a) {
                if (!x.getTh().equals("Truc tiep")) {
                    System.out.println(x);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
