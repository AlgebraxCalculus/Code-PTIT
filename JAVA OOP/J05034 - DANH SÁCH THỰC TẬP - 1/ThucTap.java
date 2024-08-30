public class ThucTap implements Comparable<ThucTap> {
    private static int cnt = 1;
    private String stt, ma, ten, lop, email, dn;
    public ThucTap (String ma, String ten, String lop, String email, String dn) {
        this.stt = String.format("%s", cnt++);
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    public String getDn() {
        return dn;
    }
    @Override
    public int compareTo(ThucTap o) {
        return ten.compareTo(o.ten);
    }
    @Override
    public String toString() {
        return stt + " " + ma + " " + ten + " " + lop + " " + email + " " + dn;
    }
}
