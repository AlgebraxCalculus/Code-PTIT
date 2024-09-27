public class Hotel {
    private String ma, ten;
    private int don_gia_ngay;
    private double phi_phuc_vu;
    public Hotel (String ma, String ten, int don_gia_ngay, double phi_phuc_vu) {
        this.ma = ma;
        this.ten = ten;
        this.don_gia_ngay = don_gia_ngay;
        this.phi_phuc_vu = phi_phuc_vu;
    }
    public String getMa() {
        return ma;
    }
    public int getDon_gia_ngay() {
        return don_gia_ngay;
    }
    public double getPhi_phuc_vu() {
        return phi_phuc_vu;
    }
}
