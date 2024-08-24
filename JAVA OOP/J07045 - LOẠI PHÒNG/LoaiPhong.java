import java.util.Comparator;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String loai_phong, ten_phong;
    private int don_gia_ngay;
    private float phi_phuc_vu;
    public LoaiPhong (String s) {
        String[] ss = s.split("\\s+");
        this.loai_phong = ss[0];
        this.ten_phong = ss[1];
        this.don_gia_ngay = Integer.parseInt(ss[2]);
        this.phi_phuc_vu = Float.parseFloat(ss[3]);
    }
    public String getTen_phong() {
        return ten_phong;
    }
    @Override
    public int compareTo(LoaiPhong o) {
        return this.ten_phong.compareTo(o.getTen_phong());
    }
    @Override
    public String toString() {
        return loai_phong + " " + ten_phong + " " + don_gia_ngay + " " + phi_phuc_vu;
    }
}
