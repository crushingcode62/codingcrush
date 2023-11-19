import java.util.*;
class p43
{
public static void main(String st[])
{
Scanner inp=new Scanner(System.in);
System.out.print("\n Enter Number of Numbers to be Calculated: ");
int n=inp.nextInt();
int i,sum=0,z;
for(i=0;i<n;i++)   
{
System.out.print("\n Enter: ");
z=inp.nextInt();
sum=sum+z;      
}
System.out.println("Sum of the numbers: "+sum);
}
}