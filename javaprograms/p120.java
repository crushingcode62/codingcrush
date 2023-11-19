import java.util.*;
public class p120 
{
   public static int avg(int a, int b, int c)
   {
         int sum,aver;
         sum= a+b+c;
         aver= sum/3;
         return aver;
    }
   public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter First number =  ");
    int n1=sc.nextInt();
    System.out.println("Enter Second number =  ");
    int  n2=sc.nextInt();
    System.out.println("Enter Third number =  ");
    int n3=sc.nextInt();
   System.out.println("Average of the elements: "+avg(n1,n2,n3));
     }
}
