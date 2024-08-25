public class Student implements Comparable<Student> {
    private String ma, ten, sdt, email;
    public Student (String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }
    public String first_name() {
        String[] ss = ten.split("\\s+");
        return ss[ss.length - 1];
    }
    @Override
    public int compareTo(Student o) {
        if (o.first_name().equals(first_name())) {
            if (o.ten.equals(ten)) {
                return ma.compareTo(o.ma);
            } else {
                return ten.compareTo(o.ten);
            }
        }
        return first_name().compareTo(o.first_name());
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt + " " + email;
    }
}
