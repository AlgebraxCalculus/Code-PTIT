import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CaThi implements Comparable<CaThi> {
    private static int cnt = 1;
    private String mathi, ngaythi, giothi, phongthi;
    public CaThi (String ngaythi, String giothi, String phongthi) {
        this.mathi = String.format("C%03d", cnt++);
        this.ngaythi = ngaythi;
        this.giothi = giothi;
        this.phongthi = phongthi;
    }
    public long getDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate d1 = LocalDate.parse(ngaythi, dateTimeFormatter);
        LocalDate d2 = LocalDate.of(2021, 1, 1);
        return ChronoUnit.DAYS.between(d2, d1);
    }
    public long getHour() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime t1 = LocalTime.parse(giothi, timeFormatter);
        LocalTime t2 = LocalTime.of(6, 0);
        return Duration.between(t2, t1).getSeconds();
    }
    @Override
    public int compareTo(CaThi o) {
        if (o.getDate() == getDate()) {
            return Long.compare(getHour(), o.getHour());
        }
        return Long.compare(getDate(), o.getDate());
    }
    @Override
    public String toString() {
        return mathi + " " + ngaythi + " " + giothi + " " + phongthi;
    }
}
