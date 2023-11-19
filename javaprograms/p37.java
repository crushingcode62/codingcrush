import java.util.Scanner;

public class p37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cone: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cone: ");
        double height = scanner.nextDouble();
        
        // Calculate the volume of the cone
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        
        System.out.println("Volume of the cone is: " + volume);
        
        scanner.close();
    }
}


