public class Ao implements Comparable<Ao> {
    private SinhVien sv;
    private String size;

    public Ao(SinhVien sv, String size) {
        this.sv = sv;
        this.size = size;
    }
    
    public String getGioiTinh() {
        return sv.getGioiTinh();
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return sv.toString();
    }

    @Override
    public int compareTo(Ao o) {
        return sv.getMa().compareTo(o.sv.getMa());
    }
}
