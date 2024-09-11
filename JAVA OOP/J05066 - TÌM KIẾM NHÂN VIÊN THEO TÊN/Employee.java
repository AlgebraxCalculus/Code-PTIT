public class Employee implements Comparable<Employee> {
    private String ma, chucvu, bac_luong, so_hieu, ten;
    public Employee (String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        chucvu = ma.substring(0, 2);
        bac_luong = ma.substring(2, 4);
        so_hieu = ma.substring(4);
        checkChucvu();
    }
    public void checkChucvu() {
        if ((chucvu.equals("GD") && Integer.parseInt(so_hieu) > 1) || (chucvu.equals("TP") && Integer.parseInt(so_hieu) > 3) || (chucvu.equals("PP") && Integer.parseInt(so_hieu) > 3)) {
            chucvu = "NV";
        }
    }
    public String getTen() {
        return ten;
    }
    @Override
    public int compareTo(Employee o) {
        if (o.bac_luong.equals(bac_luong)) {
            return so_hieu.compareTo(o.so_hieu);
        }
        return o.bac_luong.compareTo(bac_luong);
    }
    @Override
    public String toString() {
        return ten + " " + chucvu + " " + so_hieu + " " + bac_luong;
    }
}
