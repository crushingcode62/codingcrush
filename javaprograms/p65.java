import java.util.Scanner;
class p65
{
public static void main(String st[])
{
int a,b,c;
System.out.print("Enter first number = ");
Scanner s1=new Scanner(System.in);
a=s1.nextInt();

System.out.print("Enter second number = ");
Scanner s2=new Scanner(System.in);
b=s2.nextInt();

System.out.print("Enter third number = ");
Scanner s3=new Scanner(System.in);
c=s3.nextInt();
if(a==b)
 {
  if(a==c)
  {
  System.out.println("Given numbers are equal");
  }
  else
  {
  System.out.println("Given numbers are not equal");
  }
}
}
}

