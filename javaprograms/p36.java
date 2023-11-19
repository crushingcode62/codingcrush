import java.util.Scanner;

public class p36{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();
        
        // Calculate the volume of the cuboid
        double volume = length * width * height;
        
        System.out.println("Volume of the cuboid is: " + volume);
        
        scanner.close();
    }
}

