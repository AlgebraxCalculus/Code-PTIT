public class Student {
    private String name, lop, dob;
    private float diem;
    public Student (String name, String lop, String dob, float diem) {
        this.name = name;
        this.lop = lop;
        this.dob = dob;
        this.diem = diem;
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
    public void setDiem(float diem) {
        this.diem = diem;
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
    public float getDiem() {
        return diem;
    }
    public String dob_Change() {
        StringBuilder new_dob = new StringBuilder(dob);
        if (new_dob.charAt(1) == '/') {
            new_dob.insert(0, 0);
        }
        if (new_dob.charAt(4) == '/') {
            new_dob.insert(3, 0);
        }
        return new_dob.toString();
    }
    public void output() {
        System.out.printf("%s %s %s %s %.2f%n", "B20DCCN001", name, lop, dob_Change(), diem);
    }
}
