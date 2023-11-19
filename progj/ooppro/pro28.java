public class Rectangle {
    private double length;
    private double width;

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0.");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than 0.");
        }
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle();

        // Set the values using setter methods
        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);

        // Display the values using getter methods
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}