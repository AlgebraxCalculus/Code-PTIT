public class Racer {
    private String ma, ten, donvi, thoigian;
    private double vantoc;
    public Racer (String ten, String donvi, String thoigian) {
        this.ten = ten;
        this.donvi = donvi;
        this.thoigian = thoigian;
        this.ma = getMa();
        this.vantoc = getVantoc();
    }
    public String getMa() {
        String[] s1 = donvi.split("\\s+");
        String res = "";
        for (String i : s1) {
            res += i.substring(0, 1);
        }
        String[] s2 = ten.split("\\s+");
        for (String i : s2) {
            res += i.substring(0, 1);
        }
        return res;
    }
    public double getVantoc() {
        String[] tmp = thoigian.split(":");
        double h = Double.parseDouble(tmp[0]);
        double m = Double.parseDouble(tmp[1]);
        double time = (h - 6) + m / 60;
        return 120 / time;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + (int) Math.round(vantoc) + " Km/h";
    }
}
