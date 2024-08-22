public class Teacher {
    private String id, name;
    private int lcb, bac_luong, phu_cap, thu_nhap;
    public Teacher (String id, String name, int lcb) {
        this.id = id;
        this.name = name;
        this.lcb = lcb;
        this.bac_luong = getBac_luong();
        this.phu_cap = getPhu_cap();
        this.thu_nhap = getThu_nhap();
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLcb(int lcb) {
        this.lcb = lcb;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getLcb() {
        return lcb;
    }
    public int getPhu_cap() {
        String tmp1 = id.substring(0, 2);
        if (tmp1.equals("HT")) {
            return 2000000;
        } else if (tmp1.equals("HP")) {
            return 900000;
        }
        return 500000;
    }
    public int getBac_luong() {
        return Integer.parseInt(id.substring(2));
    }

    public int getThu_nhap() {
        return lcb * getBac_luong() + getPhu_cap();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + getBac_luong() + " " + getPhu_cap() + " " + getThu_nhap();
    }
}
