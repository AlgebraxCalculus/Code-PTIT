public class GiangVien implements Comparable<GiangVien> {
    private static int cnt = 1;
    private String ma, ten, bomon;
    public GiangVien (String ten, String bomon) {
        this.ma = String.format("GV%02d", cnt++);
        this.ten = ten;
        this.bomon = chuanhoa(bomon);
    }
    public String chuanhoa (String s) {
        String[] ss = s.toUpperCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1);
        }
        return res;
    }
    public String getTen() {
        String[] ss = ten.split("\\s+");
        return ss[ss.length - 1];
    }
    @Override
    public int compareTo(GiangVien o) {
        if (getTen().equals(o.getTen())) {
            return ma.compareTo(o.ma);
        }
        return getTen().compareTo(o.getTen());
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + bomon;
    }
}
