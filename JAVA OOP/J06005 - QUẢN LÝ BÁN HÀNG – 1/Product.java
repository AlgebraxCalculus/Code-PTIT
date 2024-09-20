public class Product {
    private static int cnt = 1;
    private String ma, ten, don_vi;
    private long mua, ban;
    public Product (String ten, String don_vi, long mua, long ban) {
        this.ma = String.format("MH%03d", cnt++);
        this.ten = ten;
        this.don_vi = don_vi;
        this.mua = mua;
        this.ban = ban;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getDon_vi() {
        return don_vi;
    }
    public long getMua() {
        return mua;
    }
    public long getBan() {
        return ban;
    }
}
