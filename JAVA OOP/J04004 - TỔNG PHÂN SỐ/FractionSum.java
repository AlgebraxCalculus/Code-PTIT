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
    public static long lcm (long a, long b) {
        return (a * b) / gcd(a, b);
    }
    public Fraction add(Fraction other) {
        Fraction s = new Fraction(1, 1);
        long mau_chung = lcm(this.mau, other.mau);
        s.tu = (mau_chung / this.mau * this.tu) + (mau_chung / other.mau * other.tu);
        s.mau = mau_chung;
        long uoc_chung = gcd(s.tu, s.mau);
        s.tu /= uoc_chung;
        s.mau /= uoc_chung;
        return s;
    }
    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
