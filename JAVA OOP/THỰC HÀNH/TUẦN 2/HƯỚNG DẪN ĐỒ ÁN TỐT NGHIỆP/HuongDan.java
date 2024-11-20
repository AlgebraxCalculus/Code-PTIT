public class HuongDan implements Comparable<HuongDan> {
    private String maSV, tenSV, sdtSV, tenGV, tenDA;
    public HuongDan(String maSV, String tenSV, String sdtSV, String tenGV, String tenDA) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdtSV = sdtSV;
        this.tenGV = tenGV;
        this.tenDA = tenDA;
    }
    @Override
    public int compareTo(HuongDan o) {
        return maSV.compareTo(o.maSV);
    }
    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + tenGV + " " + tenDA + " " + sdtSV;
    }
}
