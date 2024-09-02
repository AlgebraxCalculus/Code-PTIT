public class Subject implements Comparable<Subject> {
    private String ma, ten, nhom, tengv;
    public Subject (String ma, String ten, String nhom, String tengv) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tengv = tengv;
    }
    public String getTengv() {
        return tengv;
    }
    @Override
    public int compareTo(Subject o) {
        if (ma.equals(o.ma)) {
            return nhom.compareTo(o.nhom);
        }
        return ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom;
    }
}
