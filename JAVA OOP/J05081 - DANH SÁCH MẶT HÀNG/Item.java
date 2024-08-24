public class Item {
    private static int cnt = 1;
    private String ma, ten, loai;
    int mua, ban, loi_nhuan;
    public Item (String ten, String loai, int mua, int ban) {
        this.ma = String.format("MH%03d", cnt++);
        this.ten = ten;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
        this.loi_nhuan = getLoi_nhuan();
    }
    public String getMa() {
        return ma;
    }
    public int getLoi_nhuan() {
        return ban - mua;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + loai + " " + mua + " " + ban + " " + loi_nhuan;
    }
}
