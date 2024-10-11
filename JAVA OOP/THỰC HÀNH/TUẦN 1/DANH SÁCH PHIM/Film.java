public class Film implements Comparable<Film> {
    private static int cnt = 1;
    private String ma, ten, ngay_chieu, the_loai;
    private int so_tap;
    public Film (String ngay_chieu, String ten, int so_tap, String the_loai) {
        this.ma = String.format("P%03d", cnt++);
        this.ngay_chieu = ngay_chieu;
        this.ten = ten;
        this.so_tap = so_tap;
        this.the_loai = the_loai;
    }
    @Override
    public int compareTo (Film o) {
        int d1 = Integer.parseInt(ngay_chieu.substring(0, 2)), m1 = Integer.parseInt(ngay_chieu.substring(3, 5)), y1 = Integer.parseInt(ngay_chieu.substring(6));
        int d2 = Integer.parseInt(o.ngay_chieu.substring(0, 2)), m2 = Integer.parseInt(o.ngay_chieu.substring(3, 5)), y2 = Integer.parseInt(o.ngay_chieu.substring(6));
        if (y1 == y2) {
            if (m1 == m2) {
                if (d1 == d2) {
                    if (o.ten.compareTo(ten) == 0) {
                        return o.so_tap - so_tap;
                    }
                    return ten.compareTo(o.ten);
                }
                return d1 - d2;
            }
            return m1 - m2;
        }
        return y1 - y2;
    }
    @Override
    public String toString() {
        return ma + " " + the_loai + " " + ngay_chieu + " " + ten + " " + so_tap;
    }  
}
