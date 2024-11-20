public class SinhVien {
    private String ma, ten, sdt, email;
    public SinhVien(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getSDT() {
        return sdt;
    }
    public String getEmail() {
        return email;
    }
}
