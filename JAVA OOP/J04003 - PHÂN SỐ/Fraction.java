public class Fraction {
    private long tu, mau;
    public Fraction (long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd (long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public void simplify() {
        long uocchung = gcd(tu, mau);
        tu /= uocchung;
        mau /= uocchung;
    }
    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
