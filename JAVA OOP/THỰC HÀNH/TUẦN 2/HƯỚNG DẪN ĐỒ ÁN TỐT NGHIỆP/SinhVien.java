public class SinhVien {
    private String ma, ten, lop, email, sdt;
    public SinhVien (String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getSdt() {
        return sdt;
    }
}
