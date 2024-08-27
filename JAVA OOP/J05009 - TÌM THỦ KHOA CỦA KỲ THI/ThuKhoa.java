public class ThuKhoa implements Comparable<ThuKhoa> {
    private static int cnt = 1;
    private String ma, ten, dob;
    private double mon1, mon2, mon3, tongdiem;
    public ThuKhoa (String ten, String dob, double mon1, double mon2, double mon3) {
        this.ma = String.format("%d", cnt++);
        this.ten = ten;
        this.dob = dob;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.tongdiem = getTongdiem();
    }
    public double getTongdiem() {
        return mon1 + mon2 + mon3;
    }
    @Override
    public int compareTo(ThuKhoa o) {
        if (o.tongdiem == tongdiem) {
            return ma.compareTo(o.ma);
        }
        return Double.compare(o.tongdiem, tongdiem);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + dob + " " + String.format("%.1f", tongdiem);
    }
}
