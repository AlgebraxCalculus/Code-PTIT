import java.util.Scanner;

public class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void nextPoint (Scanner sc) {
        this.x = sc.nextInt();
        this.y = sc.nextInt();
    }
    public static double Area (Point a, Point b, Point c) {
        return (b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y);
    }
}
