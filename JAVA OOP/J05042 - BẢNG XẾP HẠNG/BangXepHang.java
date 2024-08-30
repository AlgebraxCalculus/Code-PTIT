public class BangXepHang implements Comparable<BangXepHang> {
    private String ten;
    private int so_bai_dung, so_submit;
    public BangXepHang (String ten, int so_bai_dung, int so_submit) {
        this.ten = ten;
        this.so_bai_dung = so_bai_dung;
        this.so_submit = so_submit;
    }
    @Override
    public int compareTo(BangXepHang o) {
        if (so_bai_dung == o.so_bai_dung) {
            if (so_submit == o.so_submit) {
                return ten.compareTo(o.ten);
            }
            return so_submit - o.so_submit;
        }
        return o.so_bai_dung - so_bai_dung;
    }
    @Override
    public String toString() {
        return ten + " " + so_bai_dung + " " + so_submit;
    }
}
