public class NhomHoc implements Comparable<NhomHoc> {
    private static int cnt = 1;
    private String ma_nhom, ma_mon, tenGV, phonghoc;
    private int thu, kip;
    public NhomHoc(String ma_mon, int thu, int kip, String tenGV, String phonghoc) {
        this.ma_nhom = String.format("HP%03d", cnt++);
        this.ma_mon = ma_mon;
        this.thu = thu;
        this.kip = kip;
        this.tenGV = tenGV;
        this.phonghoc = phonghoc;
    }
    public String getMa_nhom() {
        return ma_nhom;
    }
    public String getMa_mon() {
        return ma_mon;
    }
    public int getThu() {
        return thu;
    }
    public int getKip() {
        return kip;
    }
    public String getTenGV() {
        return tenGV;
    }
    public String getPhonghoc() {
        return phonghoc;
    }
    @Override
    public int compareTo(NhomHoc o) {
        if (o.thu == thu) {
            if (o.kip == kip) {
                return tenGV.compareTo(o.tenGV);
            }
            return kip - o.kip;
        }
        return thu - o.thu;
    }
}
