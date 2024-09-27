import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(sc.nextLine());
        Product[] a = new Product[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        }
        sc = new Scanner(new File("DATA2.in"));
        int m = sc.nextInt();
        ArrayList<Receipt> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String ma = sc.next();
            long soluong = sc.nextLong();
            long giatien = 0;
            String tenSP = "";
            for (Product x : a) {
                if (x.getMa().equals(ma.substring(0, 2))) {
                    tenSP = x.getTen();
                    if (ma.charAt(2) == '1') {
                        giatien = x.getGialoai1();
                    } else {
                        giatien = x.getGialoai2();
                    }
                    break;
                }
            }
            b.add(new Receipt(ma, soluong, tenSP, giatien));
        }
        for (Receipt x : b) {
            System.out.println(x);
        }
    }
}
