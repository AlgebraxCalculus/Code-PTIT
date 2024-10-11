public class TheLoai {
    private static int cnt = 1;
    private String ma, ten;
    public TheLoai (String ten) {
        this.ma = String.format("TL%03d", cnt++);
        this.ten = ten;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
}
