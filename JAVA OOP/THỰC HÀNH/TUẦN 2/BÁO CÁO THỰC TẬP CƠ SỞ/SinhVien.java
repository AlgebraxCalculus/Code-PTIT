public class SinhVien {
    private String ma, ten, sdt, email;
    public SinhVien(String ma, String ten, String sdt, String email) {
        this.ma = ma.trim();
        this.ten = ten.trim();
        this.sdt = sdt.trim();
        this.email = email.trim();
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
}
