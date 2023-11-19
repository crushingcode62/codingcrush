public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create an instance of the Circle class with radius 5.0
        Circle circle = new Circle(5.0);

        // Display the current radius
        System.out.println("Circle Radius: " + circle.getRadius());

        // Calculate and display the area
        System.out.println("Circle Area: " + circle.calculateArea());

        // Calculate and display the perimeter
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Update the radius to 7.5
        circle.setRadius(7.5);

        // Display the updated radius
        System.out.println("\nUpdated Circle Radius: " + circle.getRadius());

        // Calculate and display the updated area
        System.out.println("Updated Circle Area: " + circle.calculateArea());

        // Calculate and display the updated perimeter
        System.out.println("Updated Circle Perimeter: " + circle.calculatePerimeter());
    }
}