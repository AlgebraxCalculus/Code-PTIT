public class Teacher {
    private static int cnt = 1;
    private String ma, ten, xeploai;
    private double lt, th, tb;
    public Teacher (String ten, double lt, double th) {
        this.ma = String.format("TS%02d", cnt++);
        this.ten = ten;
        this.lt = lt;
        this.th = th;
        this.tb = getTb();
        this.xeploai = getXeploai();
    }
    public double getTb() {
        if (lt > 10) {
            lt /= 10;
        }
        if (th > 10) {
            th /= 10;
        }
        return (lt + th) / 2;
    }
    public String getXeploai() {
        if (tb < 5) {
            return "TRUOT";
        } else if (tb < 8) {
            return "CAN NHAC";
        } else if (tb <= 9.5) {
            return "DAT";
        }
        return "XUAT SAC";
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", tb) + " " + xeploai;
    }
}
