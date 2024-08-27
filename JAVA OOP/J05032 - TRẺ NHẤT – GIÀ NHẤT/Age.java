public class Age implements Comparable<Age> {
    private String name, dob;
    public Age (String name, String dob) {
        this.name = name;
        this.dob = dob;
    }
    @Override
    public int compareTo(Age o) {
        int y1 = Integer.parseInt(dob.substring(6)), m1 = Integer.parseInt(dob.substring(3, 5)), d1 = Integer.parseInt(dob.substring(0, 2));
        int y2 = Integer.parseInt(o.dob.substring(6)), m2 = Integer.parseInt(o.dob.substring(3, 5)), d2 = Integer.parseInt(o.dob.substring(0, 2));
        if (y1 == y2) {
            if (m1 == m2) {
                return d1 - d2;
            }
            return m1 - m2;
        }
        return y1 - y2;
    }
    @Override
    public String toString() {
        return name;
    }
}
