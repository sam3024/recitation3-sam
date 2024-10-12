/**
 * This class provides a simple Circle type that
 * creates and tracks instances of circles.
 *
 * @author (You & Me)
 * @version (2019-10-15)
 */
public class Circle {
    private Point location;
    private double radius;

    // Constructor
    public Circle(Point location, double radius) {
        this.location = location;
        this.radius = radius;
    }

    // Accessor method for location
    public Point getLocation() {
        return location;
    }

    // Mutator method for location
    public void setLocation(Point location) {
        this.location = location;
    }

    // Method to check if a point is contained in the circle
    public boolean contains(Point point) {
        double distance = location.distance(point);
        return distance <= radius;
    }

    // Method to check if this circle intersects with another circle
    public boolean intersects(Circle other) {
        double distanceBetweenCenters = location.distance(other.location);
        return distanceBetweenCenters <= (this.radius + other.radius);
    }
}

