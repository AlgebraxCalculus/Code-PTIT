public class Complex {
    private int thuc, ao;
    public Complex(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    public static Complex add(Complex a, Complex b) {
        int tong_thuc = a.thuc + b.thuc;
        int tong_ao = a.ao + b.ao;
        return new Complex(tong_thuc, tong_ao);
    }
    public static Complex multiply(Complex a, Complex b) {
        int nhan_thuc = a.thuc * b.thuc - a.ao * b.ao;
        int nhan_ao = a.thuc * b.ao + a.ao * b.thuc;
        return new Complex(nhan_thuc, nhan_ao);
    }
    public void print1() {
        if (ao < 0) {
            System.out.print(thuc + " - " + Math.abs(ao) + "i");
        } else {
            System.out.print(thuc + " + " + ao + "i");
        }
        System.out.print(", ");
    }
    public void print2() {
        if (ao < 0) {
            System.out.println(thuc + " - " + Math.abs(ao) + "i");
        } else {
            System.out.println(thuc + " + " + ao + "i");
        }
    }
}
