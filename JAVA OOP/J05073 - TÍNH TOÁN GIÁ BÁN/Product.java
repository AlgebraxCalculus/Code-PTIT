public class Product {
    private String ma;
    private int dongia, soluong;
    private double thue, phivc, tongtien;
    public Product (String ma, int dongia, int soluong) {
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    public void setThue() {
        if (ma.charAt(0) == 'T') {
            this.thue = dongia * soluong * 0.29;
        } else if (ma.charAt(0) == 'C') {
            this.thue = dongia * soluong * 0.1;
        } else if (ma.charAt(0) == 'D') {
            this.thue = dongia * soluong * 0.08;
        } else {
            this.thue = dongia * soluong * 0.02;
        }
        if (ma.charAt(3) == 'C') {
            this.thue *= 0.95;
        }
    }
    public void setPhivc() {
        if (ma.charAt(0) == 'T') {
            this.phivc = dongia * soluong * 0.04;
        } else if (ma.charAt(0) == 'C') {
            this.phivc = dongia * soluong * 0.03;
        } else if (ma.charAt(0) == 'D') {
            this.phivc = dongia * soluong * 0.025;
        } else {
            this.phivc = dongia * soluong * 0.005;
        }
    }
    public void setTongtien() {
        this.tongtien = dongia * soluong + thue + phivc; 
    }
    public String toString() {
        return ma + " " + String.format("%.2f", (double) ((tongtien * 1.2) /  soluong));
    }
}
