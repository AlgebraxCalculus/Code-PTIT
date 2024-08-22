import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher a = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(a);
    }
}
