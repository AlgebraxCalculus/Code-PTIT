import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("XETTUYEN.in"));
            int n = Integer.parseInt(sc.nextLine());
            ThiSinh[] a = new ThiSinh[n];
            for (int i = 0; i < n; i++) {
                a[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            }
            for (ThiSinh x : a) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e ) {
            System.out.println(e);
        }
    }
}
