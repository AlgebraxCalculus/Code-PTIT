public class ThanhPho {
    private String ma, ten;
    private int giacuoc;
    public ThanhPho (String ma, String ten, int giacuoc) {
        this.ma = ma;
        this.ten = ten;
        this.giacuoc = giacuoc;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public int getGiacuoc() {
        return giacuoc;
    }
}
