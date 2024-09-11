public class Student implements Comparable<Student> {
    private static int cnt = 1;
    private String ma, ten;
    private double diem1, diem2, diem3, diemTB;
    public Student (String ten, double diem1, double diem2, double diem3) {
        this.ma = String.format("SV%02d", cnt++);
        this.ten = chuanhoa(ten);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemTB = (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8;
    }
    public String chuanhoa (String s) {
        String[] ss = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public double getDiemTB() {
        return diemTB;
    }
    @Override
    public int compareTo(Student o) {
        return Double.compare(o.diemTB, diemTB);
    }
    @Override
    public String toString() {
        return ma + " " + ten + String.format("%.2f", diemTB);
    }
}
