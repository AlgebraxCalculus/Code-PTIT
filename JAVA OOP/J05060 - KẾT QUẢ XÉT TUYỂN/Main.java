import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] a = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            a[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        for (ThiSinh x : a) {
            System.out.println(x);
        }
    }
}
