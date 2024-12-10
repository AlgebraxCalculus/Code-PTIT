public class SinhVien {
    private String ma, ten, lop, email, sdt, gioiTinh;

    public SinhVien(String ma, String ten, String lop, String email, String sdt, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email + " " + sdt;
    }
}
