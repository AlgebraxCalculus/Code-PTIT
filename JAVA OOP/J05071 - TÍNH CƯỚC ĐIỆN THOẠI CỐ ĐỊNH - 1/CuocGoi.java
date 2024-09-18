public class CuocGoi {
    private String so, khuvuc;
    private int sophut, tongcuoc;
    public CuocGoi (String so, String khuvuc) {
        this.so = so;
        this.khuvuc = khuvuc;
    }
    public void setSophut (String batdau, String ketthuc) {
        String[] s1 = batdau.split(":");
        String[] s2 = ketthuc.split(":");
        int h1 = Integer.parseInt(s1[0]), m1 = Integer.parseInt(s1[1]);
        int h2 = Integer.parseInt(s2[0]), m2 = Integer.parseInt(s2[1]);
        int time = (h2 * 60 + m2) - (h1 * 60 + m1);
        if (khuvuc.equals("Noi mang")) {
            if (time % 3 == 0) {
                this.sophut = time / 3;
            } else {
                this.sophut = time / 3 + 1;
            }
        } else {
            this.sophut = time;
        }
    }
    public void setTongcuoc (int x) {
        this.tongcuoc = x * sophut;
    }
    @Override
    public String toString() {
        return so + " " + khuvuc + " " + sophut + " " + tongcuoc;
    }
}
