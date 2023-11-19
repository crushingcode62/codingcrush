import java.util.Scanner;
class p62
{
public static void main(String st[])
{
int n,i;
System.out.print("Enter a number :");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<11;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}
}
}