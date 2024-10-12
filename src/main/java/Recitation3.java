import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get x and y coordinates from the user
        System.out.println("Enter x:");
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();

        // Create an instance of Circle at (x,y) with radius 16.0
        Circle circle16 = new Circle(new Point(x, y), 16.0);
        // Create another instance of Circle at (14,12) with radius 40.0
        Circle circle40 = new Circle(new Point(14, 12), 40.0);

        // Print whether the circles intersect
        System.out.println(circle16.intersects(circle40));

        scanner.close();
    }
}
