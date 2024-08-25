public class Product {
    private String ma, ten;
    private int gia_ban, bao_hanh;
    public Product (String ma, String ten, int gia_ban, int bao_hanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia_ban = gia_ban;
        this.bao_hanh = bao_hanh;
    }
    public String getMa() {
        return ma;
    }
    public int getGia_ban() {
        return gia_ban;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gia_ban + " " + bao_hanh;
    }
}
