import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String[] ss = sc.nextLine().split("\\s+");
            double diem1 = Double.parseDouble(ss[0]);
            double diem2= Double.parseDouble(ss[1]);
            double diem3 = Double.parseDouble(ss[2]);
            double diem4 = Double.parseDouble(ss[3]);
            double diem5 = Double.parseDouble(ss[4]);
            double diem6 = Double.parseDouble(ss[5]);
            double diem7 = Double.parseDouble(ss[6]);
            double diem8 = Double.parseDouble(ss[7]);
            double diem9 = Double.parseDouble(ss[8]);
            double diem10 = Double.parseDouble(ss[9]);
            a.add(new BangDiem(ten, ((diem1 * 2) + (diem2 * 2) + diem3 + diem4 + diem5 + diem6 + diem7 + diem8 + diem9 + diem10) / 12));
        }
        Collections.sort(a);
        for (BangDiem x : a) {
            System.out.println(x);
        }
    }
}
