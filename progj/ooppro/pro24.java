
import java.util.Scanner;

class ShapeCalculator {
    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}

public class AreaCalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate the area of a circle
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        double circleArea = ShapeCalculator.calculateArea(circleRadius);
        System.out.println("Area of the circle: " + circleArea);

        // Calculate the area of a rectangle
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        double rectangleArea = ShapeCalculator.calculateArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);

        scanner.close();
    }
}