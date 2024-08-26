import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (GiangVien x : a) {
            System.out.println(x);
        }
    }
}
