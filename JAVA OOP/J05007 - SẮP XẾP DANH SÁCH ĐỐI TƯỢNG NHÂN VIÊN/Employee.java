public class Employee implements Comparable<Employee> {
    private static int cnt = 1;
    private String ma, ten, gioitinh, dob, diachi, masothue, ngayhd;
    private int y, m, d;
    public Employee (String ten, String gioitinh, String dob, String diachi, String masothue, String ngayhd) {
        this.ma = String.format("%05d", cnt++);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.dob = dob;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayhd = ngayhd;
        this.y = getY();
        this.m = getM();
        this.d = getD();
    }
    public int getY() {
        return Integer.parseInt(dob.substring(6));
    }
    public int getM() {
        return Integer.parseInt(dob.substring(3, 5));
    }
    public int getD() {
        return Integer.parseInt(dob.substring(0, 2));
    }
    @Override
    public int compareTo(Employee o) {
        if (o.y == y) {
            if (o.m == m) {
                return d - o.d;
            }
            return m - o.m;
        }
        return y - o.y;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + dob + " " + diachi + " " + masothue + " " + ngayhd;
    }
}
