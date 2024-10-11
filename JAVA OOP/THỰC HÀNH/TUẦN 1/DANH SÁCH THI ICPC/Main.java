import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Team[] a = new Team[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Team(sc.nextLine(), sc.nextLine());
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Student> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String tenTS = sc.nextLine();
            String mateamTS = sc.nextLine();
            String tenteamTS = "";
            String truongTS = "";
            for (Team x : a) {
                if (x.getMa().equals(mateamTS)) {
                    tenteamTS = x.getTen_team();
                    truongTS = x.getTen_truong();
                    break;
                }
            }
            b.add(new Student(tenTS, mateamTS, tenteamTS, truongTS));
        }
        Collections.sort(b);
        for (Student x : b) {
            System.out.println(x);
        }
    }
}
