import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer implements Comparable <Customer> {
    private static int cnt = 1;
    private String maKH, ten, ma_phong, ngay_den, ngay_di;
    private int tien_dich_vu;
    private long tong_tien;
    public Customer (String ten, String ma_phong, String ngay_den, String ngay_di, int tien_dich_vu) {
        this.maKH = String.format("KH%02d", cnt++);
        this.ten = chuan_hoa(ten);
        this.ma_phong = ma_phong.trim();
        this.ngay_den = ngay_den;
        this.ngay_di = ngay_di;
        this.tien_dich_vu = tien_dich_vu;
        this.tong_tien = getTong_tien();
    }
    public String chuan_hoa (String s) {
        String[] ss = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public long SNLT() {
        DateTimeFormatter date_format = DateTimeFormatter.ofPattern("d/M/yyyy");
        ngay_den = ngay_den.trim();
        ngay_di = ngay_di.trim();
        LocalDate st = LocalDate.parse(ngay_den, date_format);
        LocalDate en = LocalDate.parse(ngay_di, date_format);
        return ChronoUnit.DAYS.between(st, en) + 1;
    }
    public int don_gia() {
        int tang = Integer.parseInt(String.valueOf(ma_phong.charAt(0)));
        if (tang == 1) {
            return 25;
        } else if (tang == 2) {
            return 34;
        } else if (tang == 3) {
            return 50;
        }
        return 80;
    }
    public long getTong_tien() {
        return don_gia() * SNLT() + tien_dich_vu;
    }
    @Override
    public int compareTo(Customer o) {
        return Long.compare(o.tong_tien, tong_tien);
    }
    @Override
    public String toString() {
        return maKH + " " + ten + ma_phong + " " + SNLT() + " " + tong_tien;
    }
}
