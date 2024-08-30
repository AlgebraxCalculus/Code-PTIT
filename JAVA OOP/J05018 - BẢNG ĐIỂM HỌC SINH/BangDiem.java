public class BangDiem implements Comparable<BangDiem> {
    private static int cnt = 1;
    private String ma, ten, xeploai;
    private double gpa;
    public BangDiem(String ten, double gpa) {
        this.ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        this.gpa = Math.round(gpa * 10.0) / 10.0;
        this.xeploai = calculateXeploai();
    }
    private String calculateXeploai() {
        if (gpa < 5) {
            return "YEU";
        } else if (gpa <= 6.9) {
            return "TB";
        } else if (gpa <= 7.9) {
            return "KHA";
        } else if (gpa <= 8.9) {
            return "GIOI";
        } else {
            return "XUAT SAC";
        }
    }
    @Override
    public int compareTo(BangDiem o) {
        if (gpa == o.gpa) {
            return ma.compareTo(o.ma);
        }
        return Double.compare(o.gpa, gpa);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gpa + " " + xeploai;
    }
}
