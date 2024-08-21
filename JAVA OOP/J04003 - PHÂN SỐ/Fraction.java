public class Fraction {
    private long tu;
    private long mau;
    public Fraction (long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public void setTu(long tu) {
        this.tu = tu;
    }
    public void setMau(long mau) {
        this.mau = mau;
    }
    public long getTu() {
        return tu;
    }
    public long getMau() {
        return mau;
    }
    public static long gcd (long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    void simplify() {
        long uoc_chung = gcd(tu, mau);
        tu /= uoc_chung;
        mau /= uoc_chung;
    }
    void output() {
        System.out.println(tu + "/" + mau);
    }
}
