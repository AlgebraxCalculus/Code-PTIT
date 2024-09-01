public class Match implements Comparable<Match> {
    private String ma, tendoi;
    private int tong_ve;
    public Match (String ma, String tendoi, int tong_ve) {
        this.ma = ma;
        this.tendoi = tendoi;
        this.tong_ve = tong_ve;
    }
    @Override
    public int compareTo(Match o) {
        if (o.tong_ve == tong_ve) {
            return tendoi.compareTo(o.tendoi);
        }
        return o.tong_ve - tong_ve;
    }
    @Override
    public String toString() {
        return ma + " " + tendoi + " " + tong_ve;
    }
}
