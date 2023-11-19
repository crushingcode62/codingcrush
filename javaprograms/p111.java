import java.util.Scanner;
class p111 {

  public static void main(String[] args)
 {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of integers: ");
     int n = input.nextInt();
     int[] numbers = new int[n];
     int sumEven = 0, sumOdd = 0;
     System.out.print("Enter " + n + " integers: ");
     for (int i = 0; i < n; i++) 
     {
        numbers[i] = input.nextInt();

     }
     for (int i = 0; i < n; i++) {

        if (numbers[i] % 2 == 0) 
        {
           sumEven += numbers[i];
        }  
        else
        {
           sumOdd += numbers[i];
        }
     }
    System.out.println("Sum of even integers: " + sumEven);
    System.out.println("Sum of odd integers: " + sumOdd);
  }
}