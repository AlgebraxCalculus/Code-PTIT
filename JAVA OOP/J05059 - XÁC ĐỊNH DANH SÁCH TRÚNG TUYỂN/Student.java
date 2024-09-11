public class Student implements Comparable<Student> {
    private String ma, ten;
    private double toan, ly, hoa, uu_tien, tong_diem;
    public Student (String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.uu_tien = getUu_tien();
        this.tong_diem = getTong_diem();
    }
    public double getUu_tien() {
        String khu_vuc = ma.substring(0, 3);
        if (khu_vuc.equals("KV1")) {
            return 0.5;
        } else if (khu_vuc.equals("KV2")) {
            return 1.0;
        }
        return 2.5;
    }
    public double getTong_diem() {
        return (toan * 2) + ly + hoa + uu_tien;
    }
    @Override
    public int compareTo(Student o) {
        if (tong_diem == o.tong_diem) {
            return ma.compareTo(o.ma);
        }
        return Double.compare(o.tong_diem, tong_diem);
    }
    @Override
    public String toString() {
        if (tong_diem == (int) tong_diem) {
            if (uu_tien == (int) uu_tien) {
                return ma + " " + ten + " " + String.format("%.0f", uu_tien) + " " + String.format("%.0f", tong_diem);
            } else {
                return ma + " " + ten + " " + String.format("%.1f", uu_tien) + " " + String.format("%.0f", tong_diem);
            }
        } else {
            if (uu_tien == (int) uu_tien) {
                return ma + " " + ten + " " + String.format("%.0f", uu_tien) + " " + String.format("%.1f", tong_diem);
            } else {
                return ma + " " + ten + " " + String.format("%.1f", uu_tien) + " " + String.format("%.1f", tong_diem);
            }
        }
    }
}
