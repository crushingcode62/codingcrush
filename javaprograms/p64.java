import java.util.Scanner;
class p64
{
public static void main(String st[])
{
int n,count=0;
System.out.print("Enter a number = ");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
n=n/10;
count++;
}
System.out.print("No. of digits = "+count);
}
}