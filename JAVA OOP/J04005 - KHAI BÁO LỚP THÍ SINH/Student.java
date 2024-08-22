public class Student {
    private String name, dob;
    private float diem1, diem2, diem3;
    public Student (String name, String dob, float diem1, float diem2, float diem3) {
        this.name = name;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }
    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }
    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    public String getName() {
        return name;
    }
    public String getDob() {
        return dob;
    }
    public float getDiem1() {
        return diem1;
    }
    public float getDiem2() {
        return diem2;
    }
    public float getDiem3() {
        return diem3;
    }
    public float tong_diem() {
        return diem1 + diem2 + diem3;
    }
    public void output() {
        System.out.printf("%s %s %.1f%n", name, dob, tong_diem());
    }
}
