import java.util.Scanner;
class p25
{
public static void main(String x[]) 
{
float a,b;
Scanner s=new Scanner(System.in);
System.out.println("To calculate the sum of two number without using arithmetic operator enter :-");
System.out.print("First number: ");
a=s.nextFloat();
Scanner k=new Scanner(System.in);
System.out.print("Second number: ");
b=s.nextFloat();
 for (int i = 1; i <= b; i++)
        {    a++;}
System.out.println("Sum = "+a );
}
    
}