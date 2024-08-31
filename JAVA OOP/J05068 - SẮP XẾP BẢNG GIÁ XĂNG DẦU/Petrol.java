public class Petrol implements Comparable<Petrol> {
    private String ma, hang_sx;
    private long sl, dongia, thue, thanhtien;
    public Petrol (String ma, long sl) {
        this.ma = ma;
        this.sl = sl;
        this.hang_sx = getHang_sx();
        this.dongia = getDongia();
        this.thue = getThue();
        this.thanhtien = sl * dongia + thue;
    }
    public String getHang_sx() {
        String s = ma.substring(3);
        if (s.equals("BP")) {
            return "British Petro";
        } else if (s.equals("ES")) {
            return "Esso";
        } else if (s.equals("SH")) {
            return "Shell";
        } else if (s.equals("CA")) {
            return "Castrol";
        } else if (s.equals("MO")) {
            return "Mobil";
        } else {
            return "Trong Nuoc";
        }
    }
    public long getDongia() {
        if (ma.charAt(0) == 'X') {
            return 128000;
        } else if (ma.charAt(0) == 'D') {
            return 11200;
        } else {
            return 9700;
        }
    }
    public long getThue() {
        String s = ma.substring(3);
        if (s.equals("TN")) {
            return 0;
        } else {
            long tmp = sl * dongia;
            if (ma.charAt(0) == 'X') {
                return Math.round(tmp * 3.0 / 100);
            } else if (ma.charAt(0) == 'D') {
                return Math.round(tmp * 3.5 / 100);
            } else {
                return Math.round(tmp * 2.0 / 100);
            }
        }
    }
    @Override
    public int compareTo(Petrol o) {
        return Long.compare(o.thanhtien, thanhtien);
    }
    @Override
    public String toString() {
        return ma + " " + hang_sx + " " + dongia + " " + thue + " " + thanhtien;
    }
}
