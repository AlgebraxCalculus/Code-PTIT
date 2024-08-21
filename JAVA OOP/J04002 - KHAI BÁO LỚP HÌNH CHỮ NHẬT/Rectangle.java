public class Rectangle {
    private int length;
    private int width;
    private String color;
    public Rectangle (int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public String getColor() {
        return color;
    }
    public String format_Color() {
        return String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1).toLowerCase();
    }
    public void solve() {
        if (length > 0 && width > 0) {
            System.out.println((length + width) * 2 + " " + length * width + " " + format_Color());
        } else {
            System.out.println("INVALID");
        }
    }
}
