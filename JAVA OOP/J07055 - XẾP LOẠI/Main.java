import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("BANGDIEM.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<XepLoai> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new XepLoai(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            }
            Collections.sort(a);
            for (XepLoai x : a) {
                System.out.println(x);
            }
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
