public class ThiSinh implements Comparable<ThiSinh> {
    private static int cnt = 1;
    private String ma, ten, dantoc, trangthai;
    private int khuvuc;
    private double diemthi, uutien, tongdiem;
    public ThiSinh (String ten, double diemthi, String dantoc, int khuvuc) {
        this.ma = String.format("TS%02d", cnt++);
        this.ten = chuanhoa(ten);
        this.diemthi = diemthi;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
        this.uutien = getUutien();
        this.tongdiem = getTongdiem();
        this.trangthai = getTrangthai();
    }
    public String chuanhoa (String s) {
        String[] ss = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public double getUutien() {
        double total = 0;
        if (!dantoc.equals("Kinh")) {
            total += 1.5;
        }
        if (khuvuc == 1) {
            total += 1.5;
        } else if (khuvuc == 2) {
            total += 1;
        }
        return total;
    }
    public double getTongdiem() {
        return diemthi + uutien;
    }
    public String getTrangthai() {
        if (tongdiem < 20.5) {
            return "Truot";
        }
        return "Do";
    }
    @Override
    public int compareTo(ThiSinh o) {
        if (o.tongdiem == tongdiem) {
            return ma.compareTo(o.ma);
        }
        return Double.compare(o.tongdiem, tongdiem);
    }
    @Override
    public String toString() {
        return ma + " " + ten + String.format("%.1f", tongdiem) + " " + trangthai;
    }
}
