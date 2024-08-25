import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SANPHAM.in"));
            int n = Integer.parseInt(sc.nextLine());
            Product[] a = new Product[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            }
            Arrays.sort(a, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    if (o1.getGia_ban() != o2.getGia_ban()) {
                        return o2.getGia_ban() - o1.getGia_ban();
                    }
                    return o1.getMa().compareTo(o2.getMa());
                }
            });
            for (Product i : a) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
