public class ThiSinh implements Comparable<ThiSinh> {
    private String ma, ten;
    private double toan, li, hoa, diem_uu_tien, tong_diem;
    public ThiSinh (String ma, String ten, double toan, double li, double hoa) {
        this.ma = ma;
        this.ten = chuanhoa(ten);
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
        this.diem_uu_tien = getDiem_uu_tien();
        this.tong_diem = getTong_diem();
    }
    public String chuanhoa (String s) {
        String[] ss = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public double getDiem_uu_tien() {
        String khu_vuc = ma.substring(0, 3);
        if (khu_vuc.equals("KV1")) {
            return 0.5;
        } else if (khu_vuc.equals("KV2")) {
            return 1.0;
        }
        return 2.5;
    }
    public double getTong_diem() {
        return toan * 2 + li + hoa + diem_uu_tien;
    }
    @Override
    public int compareTo(ThiSinh o) {
        if (o.tong_diem == tong_diem) {
            return ma.compareTo(o.ma);
        }
        return Double.compare(o.tong_diem, tong_diem);
    }
    @Override
    public String toString() {
        String res = ma + " " + ten;
        if (diem_uu_tien == (int) diem_uu_tien) {
            res += String.format("%.0f", diem_uu_tien);
        } else {
            res += String.format("%.1f", diem_uu_tien);
        }
        if (tong_diem == (int) tong_diem) {
            res += " " + String.format("%.0f", tong_diem);
        } else {
            res += " " + String.format("%.1f", tong_diem);
        }
        return res;
    }
}
