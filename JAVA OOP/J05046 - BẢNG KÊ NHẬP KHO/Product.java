import java.util.*;

public class Product {
    private String ma, ten;
    private int sl, don_gia, tien_chiet_khau, tong;
    private static Map<String, Integer> mp = new HashMap<>();
    public Product (String ten, int sl, int don_gia) {
        this.ma = chuanhoa(ten);
        this.ten = ten;
        this.sl = sl;
        this.don_gia = don_gia;
        this.tien_chiet_khau = (int) (don_gia * sl * Chiet_khau());
        this.tong = don_gia * sl - tien_chiet_khau;
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
    public double Chiet_khau() {
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
    public String toString() {
        return ma + " " + ten + " " + tien_chiet_khau + " " + tong;
    }
}
