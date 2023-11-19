import java.util.*;
class prog54
{
    public static void main(String a[]) 
    {
    try
    {
        int n1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number: ");
        n1=s.nextInt();
        if(n1>0)
        {
            System.out.println(n1+" is positive number. ");
        }
        else
        {
            System.out.println(n1+" is negative number. ");
        }
    }
    catch(InputMismatchException e)
    {
        System.out.println("Enter only Numbers....");
    }
    }
}