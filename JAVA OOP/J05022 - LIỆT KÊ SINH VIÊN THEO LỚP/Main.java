import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (Student x : a) {
                if (x.getLop().equals(lop)) {
                    System.out.println(x);
                }
            }
        }
    }
}
