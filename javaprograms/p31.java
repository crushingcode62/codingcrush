import java.util.Scanner;
class p31{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the first diagonal: ");
        double diagonal1 = scanner.nextDouble();
        
        System.out.print("Enter the length of the second diagonal: ");
        double diagonal2 = scanner.nextDouble();
        
        // Calculate the area of the rhombus
        double area = (diagonal1 * diagonal2) / 2;
        
        System.out.println( "Area of the rhombus is: " + area);
        
        scanner.close();
    }
}
