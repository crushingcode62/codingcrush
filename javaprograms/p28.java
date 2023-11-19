import java.util.Scanner;
class p28
{
public static void main(String x[]) 
{
double l,b,area;
Scanner s=new Scanner(System.in);
System.out.println("To calculate the area of rectangle enter :-");
System.out.print("Breadth: ");
b=s.nextDouble();
Scanner k=new Scanner(System.in);
System.out.print("Length: ");
l=s.nextDouble();
area=(l*b);
System.out.println("Area of a rectangle  is  "+area );
}
    
}