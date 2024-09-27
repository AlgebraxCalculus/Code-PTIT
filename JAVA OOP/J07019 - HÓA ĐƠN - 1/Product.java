public class Product {
    private String ma, ten;
    private long gialoai1, gialoai2;
    public Product (String ma, String ten, long gialoai1, long gialoai2) {
        this.ma = ma;
        this.ten = ten;
        this.gialoai1 = gialoai1;
        this.gialoai2 = gialoai2;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public long getGialoai1() {
        return gialoai1;
    }
    public long getGialoai2() {
        return gialoai2;
    }
}
