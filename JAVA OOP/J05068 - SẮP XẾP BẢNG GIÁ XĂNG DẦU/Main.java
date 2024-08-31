import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Petrol> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] ss = sc.nextLine().split("\\s+");
            a.add(new Petrol(ss[0], Integer.parseInt(ss[1])));
        }
        Collections.sort(a);
        for (Petrol x : a) {
            System.out.println(x);
        }
    }
}
