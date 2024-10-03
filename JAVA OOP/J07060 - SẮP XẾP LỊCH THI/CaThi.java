public class CaThi {
    private static int cnt = 1;
    private String ma, ngay, gio, id;
    public CaThi (String ngay, String gio, String id) {
        this.ma = String.format("C%03d", cnt++);
        this.ngay = ngay;
        this.gio = gio;
        this.id = id;
    }
    public String getMa() {
        return ma;
    }
    public String getNgay() {
        return ngay;
    }
    public String getGio() {
        return gio;
    }
    public String getId() {
        return id;
    }
}
