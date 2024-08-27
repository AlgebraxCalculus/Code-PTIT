public class BangDiem {
    private static int cnt = 1;
    private String ma, ten, lop;
    private double diem1, diem2, diem3;
    public BangDiem (String ma, String ten, String lop, double diem1, double diem2, double diem3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public String getTen() {
        return ten;
    }
    @Override
    public String toString() {
        return String.format("%d", cnt++) + " " + ma + " " + ten + " " + lop + " " + String.format("%.1f", diem1) + " " + String.format("%.1f", diem2) + " " + String.format("%.1f", diem3);
    }
}
