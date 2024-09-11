public class Teacher implements Comparable<Teacher> {
    private static int cnt = 1;
    private String maGV, ten, maXT, monXT, xeploai;
    private double tin_hoc, chuyen_mon, uu_tien, tong_diem;
    public Teacher (String ten, String maXT, double tin_hoc, double chuyen_mon) {
        this.maGV = String.format("GV%02d", cnt++);
        this.ten = ten;
        this.maXT = maXT;
        this.monXT = getMonXT();
        this.tin_hoc = tin_hoc;
        this.chuyen_mon = chuyen_mon;
        this.uu_tien = getUu_tien();
        this.tong_diem = getTong_diem();
        this.xeploai = getXeploai();
    }
    public String getMonXT() {
        if (maXT.charAt(0) == 'A') {
            return "TOAN";
        } else if (maXT.charAt(0) == 'B') {
            return "LY";
        }
        return "HOA";
    }
    public double getUu_tien() {
        if (maXT.charAt(1) == '1') {
            return 2.0;
        } else if (maXT.charAt(1) == '2') {
            return 1.5;
        } else if (maXT.charAt(1) == '3') {
            return 1.0;
        }
        return 0;
    }
    public double getTong_diem() {
        return (tin_hoc * 2) + chuyen_mon + uu_tien;
    }
    public String getXeploai() {
        if (tong_diem < 18) {
            return "LOAI";
        }
        return "TRUNG TUYEN";
    }
    @Override
    public int compareTo(Teacher o) {
        return Double.compare(o.tong_diem, tong_diem);
    }
    @Override
    public String toString() {
        return maGV + " " + ten + " " + monXT + " " + String.format("%.1f", tong_diem) + " " + xeploai;
    }
}
