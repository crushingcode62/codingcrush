import java.util.Scanner;

public class p35{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        // Calculate the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;
        
        System.out.println("Volume of the cylinder is: " + volume);
        
        scanner.close();
    }
}
