public class Nhom implements Comparable<Nhom>  {
    private String maSV, tenSV, sdtSV, tenBT;
    private int maNhom;
    public Nhom (String maSV, int maNhom, String tenBT) {
        this.maSV = maSV;
        this.maNhom = maNhom;
        this.tenBT = tenBT;
    }
    public String getMaSV() {
        return maSV;
    }
    public int getMaNhom() {
        return maNhom;
    }
    public void setTenSV (String tenSV) {
        this.tenSV = tenSV;
    } 
    public void setSdtSV(String sdtSV) {
        this.sdtSV = sdtSV;
    }
    @Override
    public int compareTo(Nhom o) {
        return maSV.compareTo(o.maSV);
    }
    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + sdtSV + " " + maNhom + " " + tenBT;
    }
}
