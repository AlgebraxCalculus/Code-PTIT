public class Product implements Comparable<Product> {
    private String ma, ten;
    private long sl, dongia, tienchietkhau, tongtien;
    public Product (String ma, String ten, long sl, long dongia, long tienchietkhau) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.dongia = dongia;
        this.tienchietkhau = tienchietkhau;
        this.tongtien = sl * dongia - tienchietkhau;
    }
    @Override
    public int compareTo(Product o) {
        return Long.compare(o.tongtien, tongtien);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + sl + " " + dongia + " " + tienchietkhau + " " + tongtien;
    }
}
