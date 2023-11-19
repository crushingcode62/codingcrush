import java.util.Scanner;
class p118
{
    public static void main(String args[])
	{
		int num1 = 0, num2 = 1;
		int counter = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n term for Fabonacci Series =  ");
        int n=sc.nextInt();
        System.out.println("Fabonacci Series: ");
		while (counter < n) 
        {
			System.out.print(num1 + " ");
            int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}

}

