public class DonHang implements Comparable<DonHang> {
    private String ten, ma, stt;
    private int dongia, sl, giamgia, thanhtien;
    public DonHang (String ten, String ma, int dongia, int sl) {
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.sl = sl;
        this.stt = ma.substring(1, 4);
        this.giamgia = getGiamgia();
        this.thanhtien = dongia * sl - giamgia;
    }
    public int getGiamgia() {
        if (ma.charAt(4) == '1') {
            return (int) Math.round(dongia * sl * 50.0 / 100);
        } else {
            return (int) Math.round(dongia * sl * 30.0 / 100);
        }
    }
    @Override
    public int compareTo(DonHang o) {
        return stt.compareTo(o.stt);
    }
    @Override
    public String toString() {
        return ten + " " + ma + " " + stt + " " + giamgia + " " + thanhtien;
    }
}
