import java.util.Scanner;  
public class ReverseString  
{  
public static void main(String str[] )   
{  
String s;  
System.out.println("Enter a string: ");  
Scanner scanner = new Scanner(System.in);  
s = scanner.nextLine();  
scanner.close();   

String reversed = reverseString(s);  
System.out.println("The reversed string is: " + reversed);  
}  
public static String reverseString(String s)  
{  
if (s.isEmpty())                             
return s;  
return reverseString(s.substring(1)) + s.charAt(0);           
}  
}  