public class Student {
    private static int cnt = 1;
    private String ma, ten, lop, dob;
    private double gpa;
    public Student (String ten, String lop, String dob, double gpa) {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ten = chuanhoa1(ten);
        this.lop = lop;
        this.dob = chuanhoa2(dob);
        this.gpa = gpa;
    }
    public String chuanhoa1 (String s) {
        String[] ss = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public String chuanhoa2 (String s) {
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
        return ma + " " + ten + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
