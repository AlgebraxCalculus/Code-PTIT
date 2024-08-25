public class MonThi {
    private String ma_mon, ten_mon, hinh_thuc_thi;
    public MonThi (String ma_mon, String ten_mon, String hinh_thuc_thi) {
        this.ma_mon = ma_mon;
        this.ten_mon = ten_mon;
        this.hinh_thuc_thi = hinh_thuc_thi;
    }
    public String getMa_mon() {
        return ma_mon;
    }
    @Override
    public String toString() {
        return ma_mon + " " + ten_mon + " " + hinh_thuc_thi;
    }
}
