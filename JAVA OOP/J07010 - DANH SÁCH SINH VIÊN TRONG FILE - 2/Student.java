public class Student {
    private static int cnt = 1;
    private String id, name, lop, dob;
    private double gpa;
    public String chuan_hoa(String s) {
        StringBuilder ss = new StringBuilder(s);
        if (ss.charAt(1) == '/') {
            ss.insert(0, '0');
        }
        if (ss.charAt(4) == '/') {
            ss.insert(3, '0');
        }
        return ss.toString();
    }
    public Student (String name, String lop, String dob, double gpa) {
        this.id = String.format("B20DCCN%03d", cnt++);
        this.name = name;
        this.lop = lop;
        this.dob = chuan_hoa(dob);
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public String getLop() {
        return lop;
    }
    public String getDob() {
        return dob;
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
