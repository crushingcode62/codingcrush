import java.util.Scanner;
class p68
{
public static void main(String st[])
{
int a,b,n;
System.out.println("1. Add\n2. Sub\n3. Multiply\n4. Division\n");
System.out.print("Enter a number = ");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
if(n==1)
{
System.out.print("Enter first number = ");
Scanner s1=new Scanner(System.in);
a=s1.nextInt();

System.out.print("Enter second number = ");
Scanner s2=new Scanner(System.in);
b=s2.nextInt();

System.out.println("Addition = "+(a+b));
break;
}
else if(n==2)
{
System.out.print("Enter first number = ");
Scanner s1=new Scanner(System.in);
a=s1.nextInt();

System.out.print("Enter second number = ");
Scanner s2=new Scanner(System.in);
b=s2.nextInt();

System.out.println("Subtraction = "+(a-b));
break;
}
else if(n==3)
{
System.out.print("Enter first number = ");
Scanner s1=new Scanner(System.in);
a=s1.nextInt();

System.out.print("Enter second number = ");
Scanner s2=new Scanner(System.in);
b=s2.nextInt();

System.out.println("Multiplication = "+(a*b));
break;
}
else if(n==4)
{
System.out.print("Enter first number = ");
Scanner s1=new Scanner(System.in);
a=s1.nextInt();

System.out.print("Enter second number = ");
Scanner s2=new Scanner(System.in);
b=s2.nextInt();

System.out.println("Division = "+(a/b));
break;
}
else
{
System.out.println("sorry only four options are available");
break;
}
}
}
}





