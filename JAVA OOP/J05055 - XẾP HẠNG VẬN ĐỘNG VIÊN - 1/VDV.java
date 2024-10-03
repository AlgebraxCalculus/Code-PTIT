public class VDV {
    private static int cnt = 1;
    private String ma, ten, dob, bat_dau, ket_thuc, ket_qua, uu_tien, thuc_te;
    private int xep_hang;
    public VDV (String ten, String dob, String bat_dau, String ket_thuc) {
        this.ma = String.format("VDV%02d", cnt++);
        this.ten = ten;
        this.dob = dob;
        this.bat_dau = bat_dau;
        this.ket_thuc = ket_thuc;
        this.ket_qua = getKet_qua();
        this.uu_tien = getUu_tien();
        this.thuc_te = getThuc_te();
    }
    private String getUu_tien() {
        int tuoi = 2021 - Integer.parseInt(dob.substring(6));
        if (tuoi < 18) {
            return "00:00:00";
        } else if (tuoi < 25) {
            return "00:00:01";
        } else if (tuoi < 32) {
            return "00:00:02";
        }
        return "00:00:03";
    }
    private int TimetoSec (String time) {
        String[] ss = time.split(":");
        int h = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        int s = Integer.parseInt(ss[2]);
        return h * 3600 + m * 60 + s;
    }
    private String SectoTime (int total_sec) {
        int h = total_sec / 3600;
        int m = (total_sec % 3600) / 60;
        int s = total_sec % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
    public String getKet_qua() {
        int st = TimetoSec(bat_dau);
        int en = TimetoSec(ket_thuc);
        return SectoTime(en - st);
    }
    public String getThuc_te() {
        int st = TimetoSec(ket_qua);
        int en = TimetoSec(uu_tien);
        return SectoTime(st - en);
    }
    public int getThuc_teInSec() {
        int st = TimetoSec(ket_qua);
        int en = TimetoSec(uu_tien);
        return st - en;
    }
    public void setXep_hang (int x) {
        this.xep_hang = x;
    }
    public int getXep_hang() {
        return xep_hang;
    }
    public String getMa() {
        return ma;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + ket_qua + " " + uu_tien + " " + thuc_te + " " + xep_hang;
    }
}
