import java.util.Scanner;
class p67
{
public static void main(String st[])
{
int a,b,c,d,e,p;
System.out.println("Enter the marks of five subject :");
Scanner s1=new Scanner(System.in);
a=s1.nextInt();

Scanner s2=new Scanner(System.in);
b=s2.nextInt();

Scanner s3=new Scanner(System.in);
c=s3.nextInt();

Scanner s4=new Scanner(System.in);
d=s4.nextInt();

Scanner s5=new Scanner(System.in);
e=s5.nextInt();
p=(a+b+c+d+e)/5;
if(p>=90 && p<=100)
{
System.out.println("Grade A+");
}
else if(p>=80 && p<=89)
{
System.out.println("Grade A");
}
else if(p>=70 && p<=79)
{
System.out.println("Grade B+");
}
else if(p>=60 && p<=69)
{
System.out.println("Grade B");
}
else if(p>=50 && p<=59)
{
System.out.println("Grade C");
}
else if(p>=40 && p<=49)
{
System.out.println("Grade D");
}
else if(p>=30 && p<=39)
{
System.out.println("Grade E");
}
else
{
System.out.println("Fail");
}
}
}