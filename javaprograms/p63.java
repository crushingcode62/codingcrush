import java.util.Scanner;
class p63
{
public static void main(String st[])
{
int n;
System.out.print("Enter a number = ");
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n>0)
{
System.out.println("positive number");
}
else if(n<0)
{
System.out.println("negative number");
}
else
{
System.out.println("zero");
}
}
}