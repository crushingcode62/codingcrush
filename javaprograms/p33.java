import java.util.Scanner;

public class p33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the prism: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the prism: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter the height of the prism: ");
        double height = scanner.nextDouble();
        
        // Calculate the surface area of the prism
        double surfaceArea = 2 * (length * width + width * height + height * length);
        
        System.out.println("Surface area of the prism is: " + surfaceArea);
        
        scanner.close();
    }
}

