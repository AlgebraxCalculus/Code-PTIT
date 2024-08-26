public class XepLoai implements Comparable<XepLoai> {
    private static int cnt = 1;
    private String ma, ten, trangthai;
    private int lt, th, thi;
    private double tongdiem;
    public XepLoai (String ten, int lt, int th, int thi) {
        this.ma = String.format("SV%02d", cnt++);
        this.ten = chuanhoa(ten);
        this.lt = lt;
        this.th = th;
        this.tongdiem = lt * 0.25 + th * 0.35 + thi * 0.4;
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
    public String getTrangthai() {
        if (tongdiem < 5) {
            return "KEM";
        } else if (tongdiem < 6.5) {
            return "TRUNG BINH";
        } else if (tongdiem < 8) {
            return "KHA";
        }
        return "GIOI";
    }

    @Override
    public int compareTo(XepLoai o) {
        return Double.compare(o.tongdiem, tongdiem);
    }
    @Override
    public String toString() {
        return ma + " " + ten + String.format("%.2f", tongdiem) + " " + trangthai;
    }
}
