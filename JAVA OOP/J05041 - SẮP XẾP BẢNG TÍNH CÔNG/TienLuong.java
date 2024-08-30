public class TienLuong implements Comparable<TienLuong> {
    private static int cnt = 1;
    private String ma, ten, chucvu;
    private int luong_ngay, ngay_cong, luong_thang, thuong, phu_cap, thuc_linh;
    public TienLuong (String ten, int luong_ngay, int ngay_cong, String chucvu) {
        this.ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.luong_ngay = luong_ngay;
        this.ngay_cong = ngay_cong;
        this.chucvu = chucvu;
        this.luong_thang = luong_ngay * ngay_cong;
        this.thuong = getThuong();
        this.phu_cap = getPhu_cap();
        this.thuc_linh = luong_thang + thuong + phu_cap;
    }
    public int getThuong() {
        if (ngay_cong >= 25) {
            return (int) (luong_thang * 0.2);
        } else if (ngay_cong >= 22) {
            return (int) (luong_thang * 0.1);
        }
        return 0;
    }
    public int getPhu_cap() {
        if (chucvu.equals("GD")) {
            return 250000;
        } else if (chucvu.equals("PGD")) {
            return 200000;
        } else if (chucvu.equals("TP")) {
            return 180000;
        }
        return 150000;
    }
    @Override
    public int compareTo(TienLuong o) {
        return o.thuc_linh - thuc_linh;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + luong_thang + " " + thuong + " " + phu_cap + " " + thuc_linh;
    }
}
