import java.util.Objects;
public class Point {
    private int x;
    private int y;
    Point(int a, int b) {
        x = a;
        y = b;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Point p = (Point) o;
        return x == p.x && y == p.y;
    }
    public int hashCode() {
        return Objects.hash(x, y);
    }
}