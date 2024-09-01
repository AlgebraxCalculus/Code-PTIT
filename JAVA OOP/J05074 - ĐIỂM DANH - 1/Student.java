public class Student {
    private String ma, ten, lop;
    private int diem;
    public Student (String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    public String getMa() {
        return ma;
    }
    public void setDiem(String s) {
        int cntM = 0, cntV = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'm') {
                cntM++;
            } else if (s.charAt(i) == 'v') {
                cntV++;
            }
        }
        this.diem = Math.max(0, 10 - cntM - (cntV * 2));
    }
    @Override
    public String toString() {
        if (diem == 0) {
            return ma + " " + ten + " " + lop + " " + diem + " KDDK";
        } else {
            return ma + " " + ten + " " + lop + " " + diem;
        }
    }
}
