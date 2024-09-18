import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThanhPho[] a = new ThanhPho[n];
        for (int i = 0; i < n; i++) {
            a[i] = new ThanhPho(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        CuocGoi[] b = new CuocGoi[m];
        for (int i = 0; i < m; i++) {
            String[] tmp = sc.nextLine().split("\\s+");
            String so = tmp[0], batdau = tmp[1], ketthuc = tmp[2];
            String s1 = so.substring(0, 1);
            if (s1.equals("0")) {
                String s2 = so.substring(1, 3);
                for (ThanhPho x : a) {
                    if (s2.equals(x.getMa())) {
                        b[i] = new CuocGoi(so, x.getTen());
                        b[i].setSophut(batdau, ketthuc);
                        b[i].setTongcuoc(x.getGiacuoc());
                    }
                }
            } else {
                b[i] = new CuocGoi(so, "Noi mang");
                b[i].setSophut(batdau, ketthuc);
                b[i].setTongcuoc(800);
            }
        }
        Arrays.sort(b, new Comparator<CuocGoi>() {
            @Override
            public int compare(CuocGoi o1, CuocGoi o2) {
                return o2.getTongcuoc() - o1.getTongcuoc();
            }
        });
        for (CuocGoi x : b) {
            System.out.println(x);
        }
    }
}
