public class Student implements Comparable<Student> {
    private static int cnt = 1;
    private String maTS, tenTS, mateamTS, tenteamTS, truongTS;
    public Student (String tenTS, String mateamTS, String tenteamTS, String truongTS) {
        this.maTS = String.format("C%03d", cnt++);
        this.tenTS = tenTS;
        this.mateamTS = mateamTS;
        this.tenteamTS = tenteamTS;
        this.truongTS = truongTS;
    }
    @Override
    public int compareTo(Student o) {
        return tenTS.compareTo(o.tenTS);
    }
    @Override
    public String toString() {
        return maTS + " " + tenTS + " " + tenteamTS + " " + truongTS;
    }
}
