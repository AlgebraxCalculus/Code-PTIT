public class Subject implements Comparable<Subject> {
    private String ma, ten, nhom, tengv;
    public Subject (String ma, String ten, String nhom, String tengv) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tengv = tengv;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    @Override
    public int compareTo(Subject o) {
        return nhom.compareTo(o.nhom);
    }

    @Override
    public String toString() {
        return nhom + " " + tengv;
    }
}
