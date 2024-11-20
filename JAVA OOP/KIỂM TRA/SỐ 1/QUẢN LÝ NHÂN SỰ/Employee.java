public class Employee implements Comparable<Employee>{
    private static int cnt = 1;
    private String ma, ten, dob;
    private double hieuSuatCV, trachNhiemCV;
    public Employee(String ten, String dob, double hieuSuatCV, double trachNhiemCV) {
        this.ma = String.format("NS%03d", cnt++);
        this.ten = ten;
        this.dob = dob;
        this.hieuSuatCV = hieuSuatCV;
        this.trachNhiemCV = trachNhiemCV;
    }
    public double getHieuSuatCV() {
        return hieuSuatCV;
    }
    public double getTrachNhiemCV() {
        return trachNhiemCV;
    }
    
    @Override
    public int compareTo(Employee o) {
        if (hieuSuatCV == o.hieuSuatCV) {
            return Double.compare(trachNhiemCV, o.trachNhiemCV);
        }
        return Double.compare(hieuSuatCV, o.hieuSuatCV);
    }
    @Override
    public String toString() {
        if (hieuSuatCV == (int) hieuSuatCV) {
            if (trachNhiemCV == (int) trachNhiemCV) {
                return ma + " " + ten + " " + dob + " " + String.format("%.0f", hieuSuatCV) + " " + String.format("%.0f", trachNhiemCV);
            } else {
                return ma + " " + ten + " " + dob + " " + String.format("%.0f", hieuSuatCV) + " " + String.format("%.1f", trachNhiemCV);
            }
        } else {
            if (trachNhiemCV == (int) trachNhiemCV) {
                return ma + " " + ten + " " + dob + " " + String.format("%.1f", hieuSuatCV) + " " + String.format("%.0f", trachNhiemCV);
            } else {
                return ma + " " + ten + " " + dob + " " + String.format("%.1f", hieuSuatCV) + " " + String.format("%.1f", trachNhiemCV);
            }
        }
    }
}
