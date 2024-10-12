import java.util.Objects;

/**
 * Represents a 2-dimensional point.
 *
 * @author (Marwan Rasamny)
 * @version (0.1)
 */
public class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate the distance between this point and another point
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
