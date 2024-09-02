public class Teacher {
    private String ma, ten, cv;
    private int lcb, bacluong, phucap, tongluong;
    public Teacher (String ma, String ten, int lcb) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
        this.bacluong = Integer.parseInt(ma.substring(2));
        this.cv = ma.substring(0, 2);
        this.phucap = getPhucap();
        this.tongluong = lcb * bacluong + phucap;
    }
    public String getCv() {
        return cv;
    }
    public int getPhucap() {
        if (cv.equals("HT")) {
            return 2000000;
        } else if (cv.equals("HP")) {
            return 900000;
        }
        return 500000;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + bacluong + " " + phucap + " " + tongluong;
    }
}
