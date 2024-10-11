public class Student implements Comparable<Student> {
    private String ma, ten, lop, email, sdt;
    public Student (String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    @Override
    public int compareTo(Student o) {
        if (lop.equals(o.lop)) {
            return ma.compareTo(o.ma);
        }
        return lop.compareTo(o.lop);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email + " " + sdt;
    }
}
