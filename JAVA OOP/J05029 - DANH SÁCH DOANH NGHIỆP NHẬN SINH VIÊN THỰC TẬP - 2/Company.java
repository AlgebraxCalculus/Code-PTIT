public class Company {
    private String ma, ten;
    private int so_sv;
    public Company (String ma, String ten, int so_sv) {
        this.ma = ma;
        this.ten = ten;
        this.so_sv = so_sv;
    }
    public String getMa() {
        return ma;
    }
    public int getSo_sv() {
        return so_sv;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + so_sv;
    }
}
