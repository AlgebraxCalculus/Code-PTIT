public class Employee {
    private static int cnt = 1;
    private String ma, ten, gioitinh, dob, diachi, masothue, ngayhd;
    public Employee (String ten, String gioitinh, String dob, String diachi, String masothue, String ngayhd) {
        this.ma = String.format("%05d", cnt++);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.dob = dob;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayhd = ngayhd;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + dob + " " + diachi + " " + masothue + " " + ngayhd;
    }
}
