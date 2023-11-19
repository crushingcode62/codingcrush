import java.util.Scanner;
 
public class p41
{
    public static void main(String args[])
    {
        int markArray[] = new int[5];
        int i;
        float sum=0;
        float average;
        Scanner scan = new Scanner(System.in);
 
        System.out.print("Enter marks for 5 Subjects : ");
        for(i=0; i<5; i++){
            markArray[i] = scan.nextInt();
            sum = sum + markArray[i];
        }
 
        average = sum/5;
        
        System.out.print("Average Marks = " +average);
 
    }
    }