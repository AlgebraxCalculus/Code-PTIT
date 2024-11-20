public class NhiemVu implements Comparable<NhiemVu> {
    private String maSV, tenSV, sdtSV, emailSV, tenGV, tenDT;
    public NhiemVu (String maSV, String tenSV, String sdtSV, String emailSV, String tenGV, String tenDT) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdtSV = sdtSV;
        this.emailSV = emailSV;
        this.tenGV = tenGV;
        this.tenDT = tenDT;
    }
    @Override
    public int compareTo(NhiemVu o) {
        return tenDT.compareTo(o.tenDT);
    }
    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + sdtSV + " " + emailSV + " " + tenGV + " " + tenDT;
    }
}
