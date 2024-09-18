public class BangDiem implements Comparable<BangDiem> {
    private String maSV, maMon, tenSV, lopSV;
    private float diem;
    public BangDiem (String maSV, String maMon, float diem) {
        this.maSV = maSV;
        this.maMon = maMon;
        this.diem = diem;
    }
    public String getMaSV() {
        return maSV;
    }
    public String getMaMon() {
        return maMon;
    }
    public void setTenSV (String tenSV) {
        this.tenSV = tenSV;
    }
    public void setLopSV (String lopSV) {
        this.lopSV = lopSV;
    }
    @Override
    public int compareTo(BangDiem o) {
        if (o.diem == diem) {
            return maSV.compareTo(o.maSV);
        }
        return Float.compare(o.diem, diem);
    }
    @Override
    public String toString() {
        if (diem == (int) diem) {
            return maSV + " " + tenSV + " " + lopSV + " " + String.format("%.0f", diem);
        }
        return maSV + " " + tenSV + " " + lopSV + " " + diem;
    }
}
