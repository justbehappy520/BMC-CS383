public class Point {
    public Double x;
    public Double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Point)) return false;
        Point that = (Point) o;
        return this.x == that.x && this.y == that.y;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(x);
        result = 31 * result;
        result = result + Double.hashCode(y);
        return result;
    }
}
