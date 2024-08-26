public class Fraction {
    private long tu, mau;
    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    private static long gcd (long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    private static long lcm (long a, long b) {
        return (a * b) / gcd(a, b);
    }
    public static void process (Fraction a, Fraction b) {
        long mauchung = lcm(a.mau, b.mau);
        long tongtu = (mauchung/ a.mau * a.tu) + (mauchung / b.mau * b.tu);
        long tongmau = mauchung;
        long uocchung = gcd(tongtu, tongmau);
        tongtu /= uocchung;
        tongmau /= uocchung;
        tongtu *= tongtu;
        tongmau *= tongmau;
        System.out.print(tongtu + "/" + tongmau + " ");
        long mau = a.mau * b.mau * tongmau;
        long tu = a.tu * b.tu * tongtu;
        long uocchung2 = gcd(tu, mau);
        tu /= uocchung2;
        mau /= uocchung2;
        System.out.println(tu + "/" + mau);
    }
}
