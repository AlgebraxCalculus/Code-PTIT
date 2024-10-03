import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        VDV[] a = new VDV[n];
        for (int i = 0; i < n; i++) {
            a[i] = new VDV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, (VDV o1, VDV o2) -> o1.getThuc_teInSec() - o2.getThuc_teInSec());
        a[0].setXep_hang(1);
        for (int i = 1; i < n; i++) {
            if (a[i].getThuc_teInSec() == a[i - 1].getThuc_teInSec()) {
                a[i].setXep_hang(a[i - 1].getXep_hang());
            } else {
                a[i].setXep_hang(i + 1);
            }
        }
        Arrays.sort(a, (VDV o1, VDV o2) -> o1.getMa().compareTo(o2.getMa()));
        for (VDV x : a) {
            System.out.println(x);
        }
    }
}
