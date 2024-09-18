public class SinhVien {
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
        return res.trim();
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getLop() {
        return lop;
    }
}
