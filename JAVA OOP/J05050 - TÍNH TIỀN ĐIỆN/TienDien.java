public class TienDien {
    private static int cnt = 1;
    private String ma, loai;
    private int chi_so_cu, chi_so_moi, heso, thanhtien, phutroi, tongtien;
    public TienDien (String loai, int chi_so_cu, int chi_so_moi) {
        this.ma = String.format("KH%02d", cnt++);
        this.loai = loai;
        this.chi_so_cu = chi_so_cu;
        this.chi_so_moi = chi_so_moi;
        this.heso = getHeso();
        this.thanhtien = (chi_so_moi - chi_so_cu) * heso * 550;
        this.phutroi = getPhutroi();
        this.tongtien = thanhtien + phutroi;
    }
    public int getHeso() {
        if (loai.equals("KD")) {
            return 3;
        } else if (loai.equals("NN")) {
            return 5;
        } else if (loai.equals("TT")) {
            return 4;
        }
        return 2;
    }
    public int getPhutroi() {
        int tmp = chi_so_moi - chi_so_cu;
        if (tmp < 50) {
            return 0;
        } else if (tmp <= 100) {
            return (int) Math.round(thanhtien * 35.0 / 100);
        } else {
            return (int) Math.round(thanhtien * 100.0 / 100);
        }
    }
    @Override
    public String toString() {
        return ma + " " + heso + " " + thanhtien + " " + phutroi + " " + tongtien;
    }
}
