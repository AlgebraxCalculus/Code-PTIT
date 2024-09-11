public class ThucTap implements Comparable<ThucTap> {
    private String maSV, maDN;
    public ThucTap (String maSV, String maDN) {
        this.maSV = maSV;
        this.maDN = maDN;
    }
    public String getMaSV() {
        return maSV;
    }
    public String getMaDN() {
        return maDN;
    }
    @Override
    public int compareTo(ThucTap o) {
        return maSV.compareTo(o.maSV);
    }
}
