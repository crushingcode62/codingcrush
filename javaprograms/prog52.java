import java.util.*;
class prog52
{
public static void main(String a[]) 
{
    try{
            int n1,n2,n3;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter First number: ");
            n1=s.nextInt();
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter Second number: ");
            n2=s1.nextInt();
            Scanner s2=new Scanner(System.in);
            System.out.println("Enter Third number: ");
            n3=s2.nextInt();

            if(n1>n2)
            {
                if(n1>n3)
                {
                    System.out.println(n1+" is greatest number. ");
                }
                else
                {
                      System.out.println(n3+" is greatest number. ");
                }
            }
            else
            {
                if(n2>n3)
                {
                    System.out.println(n2+" is greatest number. ");

                }
                else
                {
                    System.out.println(n3+" is greatest number. ");
                }
            }

        }
    catch(InputMismatchException e)
    {
        System.out.println("Enter only Numbers....");
    }
}
}