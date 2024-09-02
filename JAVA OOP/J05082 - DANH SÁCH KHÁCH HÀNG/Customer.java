public class Customer implements Comparable<Customer> {
    private static int cnt = 1;
    private String ma, ten, gioitinh, dob, diachi;
    public Customer (String ten, String gioitinh, String dob, String diachi) {
        this.ma = String.format("KH%03d", cnt++);
        this.ten = chuanhoa1(ten);
        this.gioitinh = gioitinh;
        this.dob = chuanhoa2(dob);
        this.diachi = diachi;
    }
    public String chuanhoa1 (String s) {
        String[] ss = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : ss) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res;
    }
    public String chuanhoa2 (String s) {
        StringBuilder ss = new StringBuilder(s);
        if (ss.charAt(1) == '/') {
            ss.insert(0, '0');
        }
        if (ss.charAt(4) == '/') {
            ss.insert(3, '0');
        }
        return ss.toString();
    }
    @Override
    public int compareTo(Customer o) {
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
        return ma + " " + ten + gioitinh + " " + diachi + " " + dob;
    }
}
