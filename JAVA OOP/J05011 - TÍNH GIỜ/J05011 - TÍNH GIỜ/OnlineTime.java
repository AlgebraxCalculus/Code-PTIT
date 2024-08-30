public class OnlineTime implements Comparable<OnlineTime> {
    private String id, name, start, end;
    private int time;
    public OnlineTime (String id, String name, String start, String end) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
        this.time = getTime();
    }
    public int getTime() {
        int h1 = Integer.parseInt(start.substring(0, 2));
        int m1 = Integer.parseInt(start.substring(3));
        int h2 = Integer.parseInt(end.substring(0, 2));
        int m2 = Integer.parseInt(end.substring(3));
        return (h2 * 60 + m2) - (h1 * 60 + m1);
    }
    @Override
    public int compareTo(OnlineTime o) {
        return o.time - time;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + (time / 60) + " gio " + (time % 60) + " phut";
    }
}
