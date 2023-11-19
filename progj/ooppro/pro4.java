class Circle {
    private double radius;

    // Constructor to initialize radius
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

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleExample {
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle circle = new Circle(3.5);

        // Print the details of the circle
        System.out.println("Circle Details:");
        System.out.println("Radius: " + circle.getRadius());

        // Calculate and print the area and circumference
        System.out.println("\nArea: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        // Modify the radius and recalculate
        circle.setRadius(5.0);
        System.out.println("\nUpdated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.calculateArea());
        System.out.println("Updated Circumference: " + circle.calculateCircumference());
    }
}
