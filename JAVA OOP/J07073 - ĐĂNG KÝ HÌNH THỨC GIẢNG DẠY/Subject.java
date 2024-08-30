public class Subject implements Comparable<Subject> {
    private String ma, ten, lt, th;
    private int so_tc;
    public Subject (String ma, String ten, int so_tc, String lt, String th) {
        this.ma = ma;
        this.ten = ten;
        this.so_tc = so_tc;
        this.lt = lt;
        this.th = th;
    }
    public String getMa() {
        return ma;
    }
    public String getTh() {
        return th;
    }
    @Override
    public int compareTo(Subject o) {
        return ma.compareTo(o.ma);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + so_tc + " " + lt + " " + th;
    }
}
