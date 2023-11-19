import java.util.Scanner;

public class p32{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base length of the parallelogram: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the parallelogram: ");
        double height = scanner.nextDouble();
        
        // Calculate the area of the parallelogram
        double area = base * height;
        
        System.out.println( "Area of the parallelogram is: " + area);
        
        scanner.close();
    }
}
