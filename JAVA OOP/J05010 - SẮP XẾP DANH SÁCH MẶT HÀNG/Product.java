public class Product implements Comparable<Product> {
    private static int cnt = 1;
    private String ma, ten, loai;
    private double mua, ban, loinhuan;
    public Product (String ten, String loai, double mua, double ban) {
        this.ma = String.format("%d",cnt++);
        this.ten = ten;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = ban - mua;
    }
    @Override
    public int compareTo(Product o) {
        return Double.compare(o.loinhuan, loinhuan);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + loai + " " + String.format("%.2f", loinhuan);
    }
}
