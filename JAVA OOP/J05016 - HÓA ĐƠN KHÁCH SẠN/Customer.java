import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer implements Comparable<Customer> {
    private static int cnt = 1;
    private String ma, ten, sophong, ngaynhan, ngaytra;
    private long songay, tienphong, tiendichvu, tongtien;
    public Customer (String ten, String sophong, String ngaynhan, String ngaytra, long tiendichvu) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten.trim();
        this.sophong = sophong.trim();
        this.ngaynhan = ngaynhan.trim();
        this.ngaytra = ngaytra.trim();
        this.tiendichvu = tiendichvu;
        this.tienphong = getTienphong();
        this.songay = getSongay();
        this.tongtien = getTongtien();
    }
    public int getTienphong() {
        if (sophong.charAt(0) == '1') {
            return 25;
        } else if (sophong.charAt(0) == '2') {
            return 34;
        } else if (sophong.charAt(0) == '3') {
            return 50;
        }
        return 80;
    }
    public long getSongay() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate st = LocalDate.parse(ngaynhan, dateTimeFormatter);
        LocalDate en = LocalDate.parse(ngaytra, dateTimeFormatter);
        return ChronoUnit.DAYS.between(st, en) + 1;
    }
    public long getTongtien() {
        return songay * tienphong + tiendichvu;
    }
    @Override
    public int compareTo(Customer o) {
        return Long.compare(o.tongtien, tongtien);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + sophong + " " + songay + " " + tongtien;
    }
}
