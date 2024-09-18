public class BangDiem implements Comparable<BangDiem> {
    private String maSV, maMon, tenSV, lopSV, tenMon;
    private float diem;
    public BangDiem (String maSV, String maMon, float diem) {
        this.maSV = maSV;
        this.maMon = maMon;
        this.diem = diem;
    }
    public String getMaSV() {
        return maSV;
    }
    public String getLopSV() {
        return lopSV;
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
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    @Override
    public int compareTo(BangDiem o) {
        if (o.maMon.equals(maMon)) {
            return maSV.compareTo(o.maSV);
        }
        return maMon.compareTo(o.maMon);
    }
    @Override
    public String toString() {
        if (diem == (int) diem) {
            return maSV + " " + tenSV + " " + maMon + " " + tenMon + " " + String.format("%.0f", diem);
        }
        return maSV + " " + tenSV + " " + maMon + " " + tenMon + " " + diem;
    }
}
