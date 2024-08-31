public class Product {
    private String ma;
    private int sl_nhap, sl_xuat, don_gia, tien, thue;
    public Product (String ma, int sl_nhap) {
        this.ma = ma;
        this.sl_nhap = sl_nhap;
        this.sl_xuat = getSl_xuat();
        this.don_gia = getDon_gia();
        this.tien = sl_xuat * don_gia;
        this.thue = getThue();
    }
    public int getSl_xuat() {
        if (ma.charAt(0) == 'A') {
            return (int) Math.round(0.6 * sl_nhap);
        } else {
            return (int) Math.round(0.7 * sl_nhap);
        }
    }
    public int getDon_gia() {
        if (ma.charAt(4) == 'Y') {
            return 110000;
        }
        return 135000;
    }
    public int getThue() {
        if (ma.charAt(0) == 'A') {
            if (ma.charAt(4) == 'Y') {
                return (int) Math.round(0.08 * tien);
            } else {
                return (int) Math.round(0.11 * tien);
            }
        } else {
            if (ma.charAt(4) == 'Y') {
                return (int) Math.round(0.17 * tien);
            } else {
                return (int) Math.round(0.22 * tien);
            }
        }
    }
    @Override
    public String toString() {
        return ma + " " + sl_nhap + " " + sl_xuat + " " + don_gia + " " + tien + " " + thue;
    }
}
