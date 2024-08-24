public class Item {
    private static int cnt = 1;
    private String ma, ten, loai;
    double mua, ban, loi_nhuan;
    public Item (String ten, String loai, double mua, double ban) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
        this.loi_nhuan = getLoi_nhuan();
    }
    public String getMa() {
        return ma;
    }
    public double getLoi_nhuan() {
        return ban - mua;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + loai + " " + String.format("%.2f", loi_nhuan);
    }
}
