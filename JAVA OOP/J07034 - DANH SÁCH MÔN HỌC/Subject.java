public class Subject {
    private String ma_mon, ten_mon;
    private int so_tin_chi;
    public Subject (String ma_mon, String ten_mon, int so_tin_chi) {
        this.ma_mon = ma_mon;
        this.ten_mon = ten_mon;
        this.so_tin_chi = so_tin_chi;
    }
    public String getTen_mon() {
        return ten_mon;
    }
    @Override
    public String toString() {
        return ma_mon + " " + ten_mon + " " + so_tin_chi;
    }
}
