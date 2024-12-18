import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Item[] a = new Item[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Item(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.loi_nhuan != o2.loi_nhuan) {
                    return o2.loi_nhuan - o1.loi_nhuan;
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (Item x : a) {
            System.out.println(x);
        }
    }
}
