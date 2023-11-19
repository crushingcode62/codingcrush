class Rectangle {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class RectangleExample {
    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(5.0, 8.0);

        // Print the details of the rectangle
        System.out.println("Rectangle Details:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());

        // Calculate and print the area and perimeter
        System.out.println("\nArea: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
    