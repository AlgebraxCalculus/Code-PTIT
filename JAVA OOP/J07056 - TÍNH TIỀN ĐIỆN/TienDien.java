public class TienDien implements Comparable<TienDien> {
    private static int cnt = 1;
    private String ma, ten, loai;
    private int dau, cuoi, trong_dinh_muc, ngoai_dinh_muc, VAT, tong;
    public TienDien (String ten, String loai, int dau, int cuoi) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = chuanhoa(ten);
        this.loai = loai;
        this.dau = dau;
        this.cuoi = cuoi;
        this.trong_dinh_muc = getTrong_dinh_muc();
        this.ngoai_dinh_muc = getNgoai_dinh_muc();
        this.VAT = getVAT();
        this.tong = getTong();
    }
    public String chuanhoa (String s) {
        String[] ss = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public int Dinh_muc() {
        if (loai.equals("A")) {
            return 100;
        } else if (loai.equals("B")) {
            return 500;
        }
        return 200;
    }
    public int getTrong_dinh_muc() {
        if (cuoi - dau < Dinh_muc()) {
            return (cuoi - dau) * 450;
        }
        return Dinh_muc() * 450;
    }
    public int getNgoai_dinh_muc() {
        if (cuoi - dau > Dinh_muc()) {
            return (cuoi - dau - Dinh_muc()) * 1000;
        }
        return 0;
    }
    public int getVAT() {
        return ngoai_dinh_muc / 20;
    }
    public int getTong() {
        return trong_dinh_muc + ngoai_dinh_muc + VAT;
    }
    @Override
    public int compareTo(TienDien o) {
        return o.tong - tong;
    }
    @Override
    public String toString() {
        return ma + " " + ten + trong_dinh_muc + " " + ngoai_dinh_muc + " " + VAT + " " + tong;
    }
}
