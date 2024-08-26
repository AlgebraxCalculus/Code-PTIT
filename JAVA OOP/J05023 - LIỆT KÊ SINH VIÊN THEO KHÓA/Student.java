public class Student {
    private String ma, ten, lop, email;
    public Student (String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public String getLop() {
        return lop;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}
