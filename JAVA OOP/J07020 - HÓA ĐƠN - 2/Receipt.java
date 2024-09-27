public class Receipt {
    private static int cnt = 1;
    private String maHD, maKhach, tenKhach, diachiKhach, maHang, tenHang, donviHang;
    private long tienmua, tienban, soluong, tongtien;
    public Receipt (String maKhach, String maHang, long soluong) {
        this.maHD = String.format("HD%03d", cnt++);
        this.maKhach = maKhach;
        this.maHang = maHang;
        this.soluong = soluong;
    }
    public void setTenKhach (String tenKhach) {
        this.tenKhach = tenKhach;
    }
    public void setDiachiKhach (String diachiKhach) {
        this.diachiKhach = diachiKhach;
    }
    public void setTenHang (String tenHang) {
        this.tenHang = tenHang;
    }
    public void setDonviHang (String donviHang) {
        this.donviHang = donviHang;
    }
    public void setTienMua (long tienmua) {
        this.tienmua = tienmua;
    }
    public void setTienBan (long tienban) {
        this.tienban= tienban;
    }
    public void setTongTien() {
        this.tongtien = soluong * tienban;
    }
    @Override
    public String toString() {
        return maHD + " " + tenKhach + " " + diachiKhach + " " + tenHang + " " + donviHang + " " + tienmua + " " + tienban + " " + soluong + " " + tongtien;
    }
}
