import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Customer implements Comparable <Customer> {
    private static int cnt = 1;
    private String maKH, ten, ma_phong, ngay_den, ngay_di;
    public Customer (String ten, String ma_phong, String ngay_den, String ngay_di) {
        this.maKH = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.ma_phong = ma_phong;
        this.ngay_den = ngay_den;
        this.ngay_di = ngay_di;
    }
    public long SNLT() {
        String y1 = ngay_den.substring(6), m1 = ngay_den.substring(3, 5), d1 = ngay_den.substring(0, 2);
        String y2 = ngay_di.substring(6), m2 = ngay_di.substring(3, 5), d2 = ngay_di.substring(0, 2);
        LocalDate st = LocalDate.of(Integer.parseInt(y1), Integer.parseInt(m1), Integer.parseInt(d1));
        LocalDate en = LocalDate.of(Integer.parseInt(y2), Integer.parseInt(m2), Integer.parseInt(d2));
        return ChronoUnit.DAYS.between(st, en);
    }
    @Override
    public int compareTo(Customer o) {
        return Long.compare(o.SNLT(), this.SNLT());
    }
    @Override
    public String toString() {
        return maKH + " " + ten + " " + ma_phong + " " + SNLT();
    }
}
