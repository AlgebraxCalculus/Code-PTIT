import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OnlineTime implements Comparable<OnlineTime> {
    private String name, start, end;
    private long time;
    public OnlineTime (String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.time = getTime();
    }
    public long getTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy H:mm:ss");
        LocalDateTime dt1 = LocalDateTime.parse(start, dateTimeFormatter);
        LocalDateTime dt2 = LocalDateTime.parse(end, dateTimeFormatter);
        return Duration.between(dt1, dt2).toMinutes();
    }
    @Override
    public int compareTo(OnlineTime o) {
        if (o.time == time) {
            return name.compareTo(o.name);
        }
        return Long.compare(o.time, time);
    }
    @Override
    public String toString() {
        return name + " " + time;
    }
}
