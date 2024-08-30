import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThucTap> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new ThucTap(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String s = sc.nextLine();
            for (ThucTap x : a) {
                if (x.getDn().equals(s)) {
                    System.out.println(x);
                }
            }
        }
        
    }
}
