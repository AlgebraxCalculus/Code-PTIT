public class ThiSinh {
    private static int cnt = 1;
    private String ma, ten, dob, trang_thai;
    private double lt, th, thuong;
    private int tuoi, tong_diem;
    public ThiSinh (String ten, String dob, double lt, double th) {
        this.ma = String.format("PH%02d", cnt++);
        this.ten = ten;
        this.dob = dob.trim();
        this.lt = lt;
        this.th = th;
        this.tuoi = getTuoi();
        this.thuong = getThuong();
        this.tong_diem = getTong_diem();
        this.trang_thai = getTrang_thai();
    }
    public int getTuoi() {
        String[] tmp = dob.split("/");
        int nam_sinh = Integer.parseInt(tmp[2]);
        return 2021 - nam_sinh;
    }
    public double getThuong() {
        if (lt >= 8 && th >= 8) {
            return 1.0;
        } else if (lt >= 7.5 && th >= 7.5) {
            return 0.5;
        }
        return 0;
    }
    public int getTong_diem() {
        int total = (int) Math.round((lt + th) / 2 + thuong);
        if (total > 10) {
            return 10;
        }
        return total;
    }
    public String getTrang_thai() {
        if (tong_diem < 5) {
            return "Truot";
        } else if (tong_diem <= 6) {
            return "Trung binh";
        } else if (tong_diem == 7) {
            return "Kha";
        } else if (tong_diem == 8) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + tuoi + " " + tong_diem + " " + trang_thai;
    }
}
