public class GiangVien {
    private static int cnt = 1;
    private String ma, ten, bomon;
    public GiangVien (String ten, String bomon) {
        this.ma = String.format("GV%02d", cnt++);
        this.ten = ten;
        this.bomon = chuanhoa(bomon);
    }
    public String chuanhoa (String s) {
        String[] ss = s.split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase();
        }
        return res;
    }
    public String getTen() {
        return ten;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + bomon;
    }
}
