public class Receipt {
    private static int cnt = 1;
    private String ma, tenSP;
    private long soluong, giatien, thanhtien, giamgia, tongtien;
    public Receipt(String ma, long soluong, String tenSP, long giatien) {
        this.ma = String.format("%s-%03d", ma, cnt++);
        this.soluong = soluong;
        this.tenSP = tenSP;
        this.giatien = giatien;
        this.thanhtien = giatien * soluong;
        this.giamgia = getGiamgia();
        this.tongtien = thanhtien - giamgia;
    }
    public long getGiamgia() {
        if (soluong >= 150) {
            return (long) (0.5 * thanhtien);
        } else if (soluong >= 100) {
            return (long) (0.3 * thanhtien);
        } else if (soluong >= 50) {
            return (long) (0.15 * thanhtien);
        }
        return 0;
    }
    @Override
    public String toString() {
        return ma + " " + tenSP + " " + giamgia + " " + tongtien;
    }
}
