import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Age> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Age(sc.next(), sc.next()));
        }
        Collections.sort(a);
        System.out.println(a.get(n - 1));
        System.out.println(a.get(0));
    }
}
