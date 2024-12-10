public class SinhVien implements Comparable<SinhVien> {
    private String ten, trangThai;
    private double gpa, drl;
    
    public SinhVien(String ten, double gpa, double drl) {
        this.ten = ten;
        this.gpa = gpa;
        this.drl = drl;
        this.trangThai = getTrangThai();
    }

    public String getTrangThai() {
        if (gpa >= 3.6 && drl >= 90) {
            return "XUATSAC";
        } else if (gpa >= 3.2 && drl >= 80) {
            return "GIOI";
        } else if (gpa >= 2.5 && drl >= 70) {
            return "KHA";
        }
        return "KHONG";
    }

    public double getGpa() {
        return gpa;
    }

    public void setTrangThai() {
        this.trangThai = "KHONG";
    }
    
    @Override
    public String toString() {
        return ten + ": " + trangThai;
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(o.gpa, gpa);
    }   
}
