import java.util.Scanner;

public class Point {
    private double x, y;
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public static Point nextPoint (Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    } 
    public static double distance (Point a, Point b) {
        return Math.sqrt(Math.pow((b.getX() - a.getX()), 2)+ Math.pow(b.getY() - a.getY(), 2));
    }
}
