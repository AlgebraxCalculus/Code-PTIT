import java.util.HashMap;
import java.util.Map;

public class Product implements Comparable<Product> {
    private String ma, ten;
    private int sl, dongia, tien_chiet_khau, thanh_tien;
    private static Map<String, Integer> mp = new HashMap<>();
    public Product (String ten, int sl, int dongia) {
        this.ma = chuanhoa(ten);
        this.ten = ten;
        this.sl = sl;
        this.dongia = dongia;
        this.tien_chiet_khau = (int) (sl * dongia * Chiet_Khau());
        this.thanh_tien = sl * dongia - tien_chiet_khau;
    }
    public String chuanhoa (String s) {
        String[] ss = s.toUpperCase().split("\\s+");
        String res = String.valueOf(ss[0].charAt(0)) + String.valueOf(ss[1].charAt(0));
        if (mp.containsKey(res)) {
            mp.put(res, mp.get(res) + 1);
        } else {
            mp.put(res, 1);
        }
        return res + String.format("%02d", mp.get(res));
    }
    public double Chiet_Khau() {
        if (sl < 5) {
            return 0;
        } else if (sl < 8) {
            return 0.01;
        } else if (sl <= 10) {
            return 0.02;
        }
        return 0.05;
    }
    @Override
    public int compareTo(Product o) {
        return o.tien_chiet_khau - tien_chiet_khau;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + tien_chiet_khau + " " + thanh_tien;
    }
}
