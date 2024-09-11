public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop, email;
    public SinhVien (String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanhoa(ten);
        this.lop = lop;
        this.email = email;
    }
    public String chuanhoa (String s) {
        String[] ss = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public String getMa() {
        return ma;
    }
    @Override
    public int compareTo(SinhVien o) {
        return ma.compareTo(o.ma);
    }
    @Override
    public String toString() {
        return ma + " " + ten + lop;
    }
}
