import java.util.Scanner;
class p61
{
public static void main(String st[])
{
int l,i,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number range : ");
l=s.nextInt();
for(i=0;i<=l;i++)
{
if(i%2!=0)
{
System.out.println(i+" ");
sum=sum+i;
}

}

System.out.println("sum = "+sum);
}
}




