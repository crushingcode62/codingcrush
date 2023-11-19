import java.util.*;
class prog56
{
    public static void main(String s[])
    {
        try{
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        y=sc.nextInt();
       
        if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) 
        {
            System.out.println(y + " is Leap Year"); 
        } 
        else 
        {
            System.out.println(y + " is not a Leap Year"); 
        } 
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter valid Numbers....");
        }
    } 
}
   