import java.util.Scanner;

public class p40{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();
        
        // Calculate the surface area of the cube
        double surfaceArea = 6 * Math.pow(side, 2);
        
        System.out.println("Surface area of the cube is: " + surfaceArea);
        
        scanner.close();
    }
}

