public class Employee implements Comparable<Employee> {
    private String ma, chucvu, bac_luong, so_hieu, ten;
    private static int cntGD = 0, cntTP = 0, cntPP = 0;
    public Employee (String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    public void setChucvu() {
        String s1 = ma.substring(0, 2);
        if (s1.equals("GD")) {
            if (cntGD >= 1) {
                this.chucvu = "NV";
            } else {
                this.chucvu = "GD";
                cntGD++;
            }
        } else if (s1.equals("TP")) {
            if (cntTP >= 3) {
                this.chucvu = "NV";
            } else {
                this.chucvu = "TP";
                cntTP++;
            }
        } else if (s1.equals("PP")) {
            if (cntPP >= 3) {
                this.chucvu = "NV";
            } else {
                this.chucvu = "PP";
                cntPP++;
            }
        } else {
            this.chucvu = "NV";
        }
    }
    public void setBac_luong() {
        this.bac_luong = ma.substring(2, 4);
    }
    public void setSo_hieu() {
        this.so_hieu = ma.substring(4);
    }
    public String getChucvu() {
        return chucvu;
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
