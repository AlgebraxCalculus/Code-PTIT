public class SanPham {
    private String ma, ten;
    private int giaban, thoihan;
    public SanPham (String ma, String ten, int giaban, int thoihan) {
        this.ma = ma;
        this.ten = ten;
        this.giaban = giaban;
        this.thoihan = thoihan;
    }
    public String getMa() {
        return ma;
    }
    public int getGiaban() {
        return giaban;
    }
    public int getThoihan() {
        return thoihan;
    }
}
