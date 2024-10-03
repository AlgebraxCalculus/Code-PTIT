import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LichThi implements Comparable<LichThi> {
    private String maThi, maMon, maNhom, ngayThi, gioThi, idThi, tenMon;
    private int soSV;
    public LichThi (String maThi, String maMon, String maNhom, int soSV, String ngayThi, String gioThi, String idThi, String tenMon) {
        this.maThi = maThi;
        this.maMon = maMon;
        this.maNhom = maNhom;
        this.soSV = soSV;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.idThi = idThi;
        this.tenMon = tenMon;
    }
    public long getDate() {
        DateTimeFormatter datetimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate d1 = LocalDate.parse(ngayThi, datetimeFormatter);
        LocalDate d2 = LocalDate.of(2021, 1, 1);
        return ChronoUnit.DAYS.between(d2, d1);
    }
    public long getHour() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime t1 = LocalTime.parse(gioThi, timeFormatter);
        LocalTime t2 = LocalTime.of(6, 0);
        return Duration.between(t2, t1).getSeconds();
        
    }
    @Override
    public int compareTo(LichThi o) {
        if (o.getDate() == getDate()) {
            return Long.compare(getHour(), o.getHour());
        }
        return Long.compare(getDate(), o.getDate());
    }
    @Override
    public String toString() {
        return ngayThi + " " + gioThi + " " + idThi + " " + tenMon + " " + maNhom + " " + soSV;
    }
}
