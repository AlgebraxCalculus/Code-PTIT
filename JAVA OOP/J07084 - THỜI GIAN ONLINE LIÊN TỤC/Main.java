import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("ONLINE.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<OnlineTime> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new OnlineTime(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            Collections.sort(a);
            for (OnlineTime x : a) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
