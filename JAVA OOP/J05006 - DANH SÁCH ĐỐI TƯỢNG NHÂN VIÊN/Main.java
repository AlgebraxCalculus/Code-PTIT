import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Employee[] a = new Employee[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for (Employee x : a) {
            System.out.println(x);
        }
    }
}
