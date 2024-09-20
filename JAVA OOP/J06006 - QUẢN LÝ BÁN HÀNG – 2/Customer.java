public class Customer {
    private static int cnt = 1;
    private String ma, ten, gioitinh, ngaysinh, diachi;
    public Customer (String ten, String gioitinh, String ngaysinh, String diachi) {
        this.ma = String.format("KH%03d", cnt++);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getDiachi() {
        return diachi;
    }
}
