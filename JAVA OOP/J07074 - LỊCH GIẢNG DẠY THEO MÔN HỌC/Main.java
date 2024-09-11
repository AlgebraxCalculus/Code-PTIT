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
            String s = sc.next();
            String name = "";
            for (MonHoc x : a) {
                if (x.getMa().equals(s)) {
                    name = x.getTen();
                }
            }
            System.out.println("LICH GIANG DAY MON " + name + ":");
            for (NhomHoc x : b) {
                if (x.getMa_mon().equals(s)) {
                    System.out.println(x);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
