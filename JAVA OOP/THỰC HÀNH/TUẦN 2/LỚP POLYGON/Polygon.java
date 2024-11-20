public class Polygon {
    private Point[] p;
    public Polygon (Point[] p) {
        this.p = p;
    }
    public int getNumOfPoints() {
        return p.length;
    }
    public String getArea(){  
        double area = 0.0;
        int n = getNumOfPoints();
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += p[i].getX() * p[j].getY();
            area -= p[j].getX() * p[i].getY();
        }
        return String.format("%.3f", Math.abs(area) / 2.0);
    }
}
