import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<MonHoc> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            }
            sc = new Scanner(new File("LICHGD.in"));
            int m = Integer.parseInt(sc.nextLine());
            ArrayList<NhomHoc> b = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                b.add(new NhomHoc(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
            }
            Collections.sort(b);
            String name = sc.nextLine();
            System.out.println("LICH GIANG DAY GIANG VIEN " + name + ":");
            for (NhomHoc x : b) {
                if (x.getTenGV().equals(name)) {
                    System.out.print(x.getMa_nhom() + " ");
                    for (MonHoc y : a) {
                        if (y.getMa().equals(x.getMa_mon())) {
                            System.out.print(y.getTen() + " ");
                            break;
                        }
                    }
                    System.out.print(x.getThu() + " " + x.getKip() + " " + x.getPhonghoc());
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
