public class Triangle {
    private Point p1, p2, p3;
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean valid() {
        double d1 = Point.distance(p1, p2);
        double d2 = Point.distance(p2, p3);
        double d3 = Point.distance(p1, p3);
        if (d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) {
            return false;
        }
        return true;
    }
    public String getPerimeter() {
        double d1 = Point.distance(p1, p2);
        double d2 = Point.distance(p2, p3);
        double d3 = Point.distance(p1, p3);
        return String.format("%.3f", d1 + d2 + d3);
    }
}
