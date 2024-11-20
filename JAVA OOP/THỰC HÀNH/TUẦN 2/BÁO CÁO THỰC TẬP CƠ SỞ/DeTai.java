public class DeTai {
    private static int cnt = 1;
    private String maDT, tenGV, tenDT;
    public DeTai (String tenGV, String tenDT) {
        this.maDT = String.format("DT%03d", cnt++);
        this.tenGV = tenGV.trim();
        this.tenDT = tenDT.trim();
    }
    public String getMaDT() {
        return maDT;
    }
    public String getTenGV() {
        return tenGV;
    }
    public String getTenDT() {
        return tenDT;
    }
}
