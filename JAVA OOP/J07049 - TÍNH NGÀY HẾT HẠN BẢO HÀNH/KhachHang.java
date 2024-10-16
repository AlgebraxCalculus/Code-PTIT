import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang implements Comparable<KhachHang> {
    private static int cnt = 1;
    private String maKH, ten, diachi, maSP, ngaymua, ngayhethan;
    private int sl, giaban, thoihan, tongtien;
    public KhachHang(String ten, String diachi, String maSP, int sl, String ngaymua, int giaban, int thoihan) {
        this.maKH = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.diachi = diachi;
        this.maSP = maSP;
        this.sl = sl;
        this.ngaymua = ngaymua;
        this.giaban = giaban;
        this.thoihan = thoihan;
        this.tongtien = sl * giaban;
        this.ngayhethan = getNgayhethan();
    }
    public String getNgayhethan() {
        DateTimeFormatter datetimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate st = LocalDate.parse(ngaymua, datetimeFormatter);
        return st.plusMonths(thoihan).format(datetimeFormatter);
    }
    @Override
    public int compareTo(KhachHang o) {
       int d1 = Integer.parseInt(ngayhethan.substring(0, 2)), m1 = Integer.parseInt(ngayhethan.substring(3, 5)), y1 = Integer.parseInt(ngayhethan.substring(6));
       int d2 = Integer.parseInt(o.ngayhethan.substring(0, 2)), m2 = Integer.parseInt(o.ngayhethan.substring(3, 5)), y2 = Integer.parseInt(o.ngayhethan.substring(6));
       if (y1 == y2) {
           if (m1 == m2) {
               if (d1 == d2) {
                   return maKH.compareTo(o.maKH);
               }
               return d1 - d2;
           }
           return m1 - m2;
       }
       return y1 - y2;
    }
    @Override
    public String toString() {
        return maKH + " " + ten + " " + diachi + " " + maSP + " " + tongtien + " " + ngayhethan;
    }
}
