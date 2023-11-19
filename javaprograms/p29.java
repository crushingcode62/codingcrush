import java.util.Scanner;
class p29
{
public static void main(String x[]) 
{
double b,h,area;
Scanner s=new Scanner(System.in);
System.out.println("To calculate the area of triangle enter :-");
System.out.print("Base: ");
b=s.nextDouble();
Scanner k=new Scanner(System.in);
System.out.print("Height: ");
h=s.nextDouble();
area=(b*h)/2;
System.out.println("Area of a triangle  is  "+area );
}
    
}