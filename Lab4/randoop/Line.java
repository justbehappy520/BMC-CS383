public class Line {
    public Point point1;
    public Point point2;

    public Line(Point p1, Point p2) {
        if (p1 != null) {
            this.point1 = new Point(p1.x, p1.y);
        }
        if (p2 != null) {
            this.point2 = new Point(p2.x, p2.y);
        }
    }

    @Override
    public boolean equals(Object o) {
        Line that = (Line) o;

        if (this.point1 != null && !this.point1.equals(that.point1)) {
            return false;
        }

        if (this.point2 != null && !this.point2.equals(that.point2)) {
            return false;
        }

        if (this.point1 == null && that.point1 != null) {
            return false;
        }

        if (this.point2 == null && that.point2 != null) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int result = point1.hashCode();
        result = result + point2.hashCode();
        return result;
    }

}
