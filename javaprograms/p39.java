import java.util.Scanner;

public class p39{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        // Calculate the surface area of the cylinder
        double surfaceArea = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        
        System.out.println("Surface area of the cylinder is: " + surfaceArea);
        
        scanner.close();
    }
}

