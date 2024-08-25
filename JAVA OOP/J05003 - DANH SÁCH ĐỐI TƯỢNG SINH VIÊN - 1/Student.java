public class Student {
    private static int cnt = 1;
    private String ma, ten, lop, dob;
    private float gpa;
    public Student (String ten, String lop, String dob, float gpa) {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.lop = lop;
        this.dob = chuan_hoa(dob);
        this.gpa = gpa;
    }
    public String chuan_hoa (String s) {
        StringBuilder ss = new StringBuilder(s);
        if (ss.charAt(1) == '/') {
            ss.insert(0, '0');
        }
        if (ss.charAt(4) == '/') {
            ss.insert(3, '0');
        }
        return ss.toString();
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
