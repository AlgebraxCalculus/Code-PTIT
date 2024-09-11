public class Product {
    private String ma, ten, xeploai;
    private int sl_nhap, gia_nhap, tong_nhap, sl_xuat, tong_xuat;
    private double lai;
    public Product (String ma, String ten, String xeploai) {
        this.ma = ma;
        this.ten = ten;
        this.xeploai = xeploai;
        this.lai = getLai();
    }
    public void setSl_nhap (int sl_nhap) {
        this.sl_nhap = sl_nhap;

    }
    public void setGia_nhap (int gia_nhap) {
        this.gia_nhap = gia_nhap;
    }
    public void setSl_xuat (int sl_xuat) {
        this.sl_xuat = sl_xuat;
    }
    public double getLai() {
        if (xeploai.equals("A")) {
            return 1.08;
        } else if (xeploai.equals("B"))  {
            return 1.05;
        }
        return 1.02;
    }
    public void updateTong() {
        this.tong_nhap = sl_nhap * gia_nhap;
        this.tong_xuat = (int) (sl_xuat * gia_nhap * lai);
    }
    public String getMa() {
        return ma;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + tong_nhap + " " + tong_xuat;
    }
}
