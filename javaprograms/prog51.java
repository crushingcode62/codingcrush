import java.util.Scanner;
class pow_num
{
public static void main(String a[]) 
{
int n1,n2,res=1,p;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number: ");
n1=s.nextInt();
Scanner s1=new Scanner(System.in);
System.out.println("Enter the power of a  number: ");
n2=s1.nextInt();
p=n2;
while(n2>=1)
{
    res= res*n1;
    n2--;
}
System.out.println(n1 + " raise to power "+p+" = "+res);
}
    
}