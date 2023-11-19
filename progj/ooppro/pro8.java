class TrafficLight {
    private String color;
    private int duration;

    // Constructor to initialize color and duration
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor, int newDuration) {
        color = newColor;
        duration = newDuration;
        System.out.println("Traffic light changed to " + color + " for " + duration + " seconds.");
    }

    // Method to check if the traffic light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the traffic light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }
}

public class TrafficLightExample {
    public static void main(String[] args) {
        // Create an instance of the TrafficLight class
        TrafficLight trafficLight = new TrafficLight("red", 30);

        // Display the initial state of the traffic light
        System.out.println("Initial Traffic Light State:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        // Check if the traffic light is red or green
        System.out.println("\nIs the traffic light red? " + trafficLight.isRed());
        System.out.println("Is the traffic light green? " + trafficLight.isGreen());

        // Change the color and duration of the traffic light
        trafficLight.changeColor("green", 45);

        // Display the updated state of the traffic light
        System.out.println("\nUpdated Traffic Light State:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        // Check if the traffic light is red or green after the change
        System.out.println("\nIs the traffic light red? " + trafficLight.isRed());
        System.out.println("Is the traffic light green? " + trafficLight.isGreen());
    }
}s