import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer implements Comparable<Customer> {
    private static int cnt = 1;
    private String ma, ten, phong, ngay_den, ngay_di;
    private int don_gia;
    private long soNgay;
    private double phi_pv, giam_gia, tong_tien;
    public Customer (String ten, String phong, String ngay_den, String ngay_di, int don_gia, double phi_pv) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.phong = phong;
        this.ngay_den = ngay_den;
        this.ngay_di = ngay_di;
        this.don_gia = don_gia;
        this.phi_pv = phi_pv;
        this.soNgay = getSoNgay();
        this.giam_gia = getGiam_gia();
        this.tong_tien = getTongtien();
    }
    public long getSoNgay() {
        DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate d1 = LocalDate.parse(ngay_den, datetimeformatter);
        LocalDate d2 = LocalDate.parse(ngay_di, datetimeformatter);
        return ChronoUnit.DAYS.between(d1, d2);
    }
    public double getGiam_gia() {
        if (soNgay >= 30) {
            return 0.06;
        } else if (soNgay >= 20) {
            return 0.04;
        } else if (soNgay >= 10) {
            return 0.02;
        }
        return 0;
    }
    public double getTongtien() {
        double price = soNgay * don_gia;
        if (soNgay == 0) {
            price = don_gia;
        }
        return price * (1 - giam_gia) * (1 + phi_pv);
    }
    @Override
    public int compareTo(Customer o) {
        return Long.compare(o.soNgay, soNgay);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + phong + " " + soNgay + " " + String.format("%.2f", tong_tien);
    }
}
