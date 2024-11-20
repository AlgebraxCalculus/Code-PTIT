public class HoiDong implements Comparable <HoiDong> {
    private String maHD, maSV, tenSV, tenDT, tenGV;
    public HoiDong(String maHD, String maSV, String tenSV, String tenDT, String tenGV) {
        this.maHD = maHD;
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tenDT = tenDT;
        this.tenGV = tenGV;
    }    
    @Override
    public int compareTo(HoiDong o) {
        return maSV.compareTo(o.maSV);
    }
    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + tenDT + " " + tenGV;
    }
}
