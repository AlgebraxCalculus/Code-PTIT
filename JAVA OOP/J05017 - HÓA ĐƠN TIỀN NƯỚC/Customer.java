public class Customer implements Comparable<Customer> {
    private static int cnt = 1;
    private String ma, ten;
    private int cu, moi, tong_nuoc, don_gia, tong_tien;
    private double phu_phi;
    public Customer (String ten, int cu, int moi) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.cu = cu;
        this.moi = moi;
        this.tong_nuoc = moi - cu;
        this.don_gia = getDon_gia();
        this.phu_phi = getPhu_phi();
        this.tong_tien = (int) Math.round(don_gia * phu_phi);
    }
    public int getDon_gia() {
        if (tong_nuoc <= 50) {
            return tong_nuoc * 100;
        } else if (tong_nuoc <= 100) {
            return 50 * 100 + (tong_nuoc - 50) * 150;
        } else {
            return 50 * 100 + 50 * 150 + (tong_nuoc - 100) * 200;
        }
    }
    public double getPhu_phi() {
        if (tong_nuoc <= 50) {
            return 1.02;
        } else if (tong_nuoc <= 100) {
            return 1.03;
        } else {
            return 1.05;
        }
    }
    @Override
    public int compareTo(Customer o) {
        return o.tong_tien - tong_tien;
    }
    public String toString() {
        return ma + " " + ten + " " + tong_tien;
    }
}
