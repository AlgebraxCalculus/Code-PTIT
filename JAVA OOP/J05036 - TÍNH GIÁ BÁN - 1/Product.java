public class Product {
    private static int cnt = 1;
    private String ma, ten, donvi;
    private int nhap, sl, phi_vc, thanhtien, giaban;
    public Product (String ten, String donvi, int nhap, int sl) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.donvi = donvi;
        this.nhap = nhap;
        this.sl = sl;
        this.phi_vc = getPhi_vc();
        this.thanhtien = getThanhtien();
        this.giaban = getGiaban();
    }
    public int getPhi_vc() {
        return (int) Math.round((nhap * sl) * 0.05);
    }
    public int getThanhtien() {
        return (int) Math.round(nhap * sl + phi_vc);
    }
    public int getGiaban(){
        return (int) Math.round(thanhtien + thanhtien * 0.02);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + phi_vc + " " + thanhtien + " " + giaban;
    }
}
