public class ThuNhap {
    private static int cnt = 1;
    private String ma, ten, chucvu;
    private int lcb, ngaycong, phucap, tamung, luongchinh, conlai;
    public ThuNhap (String ten, String chucvu, int lcb, int ngaycong) {
        this.ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.chucvu = chucvu;
        this.lcb = lcb;
        this.ngaycong = ngaycong;
        this.phucap = getPhucap();
        this.luongchinh = lcb * ngaycong;
        this.tamung = getTamung();
        this.conlai = luongchinh + phucap - tamung;
    }
    public int getPhucap() {
        if (chucvu.equals("GD")) {
            return 500;
        } else if (chucvu.equals("PGD")) {
            return 400;
        } else if (chucvu.equals("TP")) {
            return 300;
        } else if (chucvu.equals("KT")) {
            return 250;
        } 
        return 100;
    }
    public int getTamung() {
        int tmp = (phucap + luongchinh) * 2 / 3;
        if (tmp < 25000) {
            return (int) (Math.round((double) tmp / 1000) * 1000);
        } else {
            return 25000;
        }
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + phucap + " " + luongchinh + " " + tamung + " " + conlai;
    }
}
