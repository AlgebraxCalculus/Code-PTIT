public class Employee {
    private static int cnt = 1;
    private String ma, ten, chuc_vu;
    private int lcb, ngay_cong, thuong, phu_cap, thu_nhap;
    public Employee (String ten, int lcb, int ngay_cong, String chuc_vu) {
        this.ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.lcb = lcb;
        this.ngay_cong = ngay_cong;
        this.chuc_vu = chuc_vu;
        this.thuong = getThuong();
        this.phu_cap = getPhu_cap();
        this.thu_nhap = getThu_nhap();
    }
    public int getThuong() {
        int luong = lcb * ngay_cong;
        if (ngay_cong > 25) {
            return luong * 20 / 100;
        } else if (ngay_cong > 22) {
            return luong * 10 / 100;
        }
        return 0;
    }
    public int getPhu_cap() {
        if (chuc_vu.equals("GD")) {
            return 250000;
        } else if (chuc_vu.equals("PGD")) {
            return 200000;
        } else if (chuc_vu.equals("TP")) {
            return 180000;
        }
        return 150000;
    }
    public int getThu_nhap() {
        return lcb * ngay_cong + thuong + phu_cap;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + (lcb * ngay_cong) + " " + thuong + " " + phu_cap + " " + thu_nhap;
    }
}
