import java.util.Scanner;
class sum
{
    public static void main(String st[])
    {
        int num=12345,sum=0,temp;
        temp=num;
        if(num<0)
        {
            System.out.println("Enter any positive number.");

        }
        else
        {
            while(num!=0)
            {
                sum=sum+num%10;
                num=num/10;
            }
            System.out.println("Sum of all digits  in the "+temp+" is "+sum);
          

        }
    }
}