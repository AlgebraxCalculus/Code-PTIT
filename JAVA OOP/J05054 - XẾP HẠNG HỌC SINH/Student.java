public class Student implements Comparable<Student> {
    private static int cnt = 1;
    private String ma, ten, xeploai;
    private double diemTB;
    private int thu_hang;
    public Student (String ten, double diemTB) {
        this.ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        this.diemTB = diemTB;
        this.xeploai = getXeploai();
    }
    public void setThu_hang (int thu_hang) {
        this.thu_hang = thu_hang;
    }
    public double getDiemTB() {
        return diemTB;
    }
    public String getMa() {
        return ma;
    }
    public String getXeploai() {
        if (diemTB < 5) {
            return "Yeu";
        } else if (diemTB < 7) {
            return "Trung Binh";
        } else if (diemTB < 9) {
            return "Kha";
        }
        return "Gioi";
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.diemTB, diemTB);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + diemTB + " " + xeploai + " " + thu_hang;
    }
}
