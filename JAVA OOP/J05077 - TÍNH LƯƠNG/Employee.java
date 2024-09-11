public class Employee {
    private String ma, ten, nhom, ma_phong, ten_phong;
    private int lcb, ngay_cong, heso, nam_cong_tac, luong_thang;
    public Employee (String ma, String ten, int lcb, int ngay_cong) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
        this.ngay_cong = ngay_cong;
        this.nhom = Character.toString(ma.charAt(0));
        this.nam_cong_tac = Integer.parseInt(ma.substring(1, 3));
        this.ma_phong = ma.substring(3);
        this.heso = getHeso();
        this.luong_thang = lcb * 1000 * ngay_cong * heso;
    } 
    public int getHeso() {
        if (nhom.equals("A")) {
            if (nam_cong_tac >= 1 && nam_cong_tac <= 3) {
                return 10;
            } else if (nam_cong_tac >= 4 && nam_cong_tac <= 8) {
                return 12;
            } else if (nam_cong_tac >= 9 && nam_cong_tac <= 15) {
                return 14;
            } else {
                return 20;
            }
        } else if (nhom.equals("B")) {
            if (nam_cong_tac >= 1 && nam_cong_tac <= 3) {
                return 10;
            } else if (nam_cong_tac >= 4 && nam_cong_tac <= 8) {
                return 11;
            } else if (nam_cong_tac >= 9 && nam_cong_tac <= 15) {
                return 13;
            } else {
                return 16;
            }
        } else if (nhom.equals("C")) {
            if (nam_cong_tac >= 1 && nam_cong_tac <= 3) {
                return 9;
            } else if (nam_cong_tac >= 4 && nam_cong_tac <= 8) {
                return 10;
            } else if (nam_cong_tac >= 9 && nam_cong_tac <= 15) {
                return 12;
            } else {
                return 14;
            }
        } else {
            if (nam_cong_tac >= 1 && nam_cong_tac <= 3) {
                return 8;
            } else if (nam_cong_tac >= 4 && nam_cong_tac <= 8) {
                return 9;
            } else if (nam_cong_tac >= 9 && nam_cong_tac <= 15) {
                return 11;
            } else {
                return 13;
            }
        }
    }
    public void setTen_phong (String x) {
        this.ten_phong = x;
    }
    public String getMa_phong() {
        return ma_phong;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + ten_phong + " " + luong_thang;
    }
}
