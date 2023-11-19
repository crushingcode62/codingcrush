import java.util.Scanner;
class p119 { 
 public static void main(String[] args) { 
 int  sum, finalSum = 0, i, j; 
System.out.println("Please enter value of N: ");

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
 for(i = 1; i <= n; i++){ 
 sum = 0; 
 for(j = 1; j <= i; j++){ 
 sum += j; 
 } 
 finalSum += sum; 
 } 
 System.out.println("Sum : " + finalSum); 
 }  
} 