import java.util.Scanner;

public class p38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();
        
        // Calculate the surface area of the cuboid
        double surfaceArea = 2 * (length * width + width * height + height * length);
        
        System.out.println("Surface area of the cuboid is: " + surfaceArea);
        
        scanner.close();
    }
}

