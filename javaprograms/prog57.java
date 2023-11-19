import java.util.*;
class prog57
{
    public static void main(String s[])
    {
        try{
        int n1,n2,n3,n4,n5,sum,avg;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number: ");
         n1=sc.nextInt();
        System.out.print("Enter Second number: ");
         n2=sc.nextInt();
        System.out.print("Enter Third number: ");
         n3=sc.nextInt();
        System.out.print("Enter Fourth number: ");
         n4=sc.nextInt();
        System.out.print("Enter Fifth number: ");
         n5=sc.nextInt();
       
        sum= n1+n2+n3+n4+n5;
        avg= sum/5;
        System.out.println("Sum of 5 numbers are : "+ sum);
        System.out.println("Average of 5 numbers are : "+avg);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter valid Numbers....");
        }
    } 
}
   