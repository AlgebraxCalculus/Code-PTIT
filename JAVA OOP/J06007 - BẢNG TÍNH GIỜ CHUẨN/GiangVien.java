public class GiangVien {
    private String ma, ten;
    private double time;
    public GiangVien (String ma, String ten) {
        this.ma = ma;
        this.ten = ten.trim();
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public void setTime(double x) {
        this.time += x;
    }
    @Override
    public String toString() {
        return ten + " " + String.format("%.2f", time);
    }
}
