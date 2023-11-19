import java.util.Scanner;
public class prog11 {
  
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number1; 
        int number2; 
        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); // Read the first number from the user
        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); // Read the second number from the user
        // Compare and display the results
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
       
    }
}