import java.util.Scanner;
public class prog10 {
  public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int digits = in.nextInt();
	  System.out.println("The sum of digits is " + sumDigits(digits));
    }

    public static int sumDigits(long n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}
}