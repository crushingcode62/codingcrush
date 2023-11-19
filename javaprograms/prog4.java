import java.util.Scanner;
public class prog4 {
 
 public static void main(String[] args) {
  // Create a Scanner object to read input from the user
  Scanner in = new Scanner(System.in);
  System.out.print("Enter first number: ");
  int num1 = in.nextInt();
  System.out.print("Enter second number: ");
   int num2 = in.nextInt();
  // Calculate and print the sum of the two numbers
  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
   
  // Calculate and print the difference of the two numbers
  System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
   
  // Calculate and print the product of the two numbers
  System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
   
  // Calculate and print the division of the two numbers
  System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
 
  // Calculate and print the remainder of the division of the two numbers
  System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
 }
}