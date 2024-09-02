public class Student {
    private String ma, ten, sdt;
    private int nhom;
    public Student (String ma, String ten, String sdt, int nhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }
    public int getNhom() {
        return nhom;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt;
    }
}
