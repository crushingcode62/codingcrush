import java.util.*;
public class p45
{
        public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the units of electricity consumed : ");
        int units = sc.nextInt(); 
        
        int bill = 0;
        
        if(units <= 100){
            bill = units * 10;
        }
        
        else if(units <= 200){
            bill = 100 * 10 + (units - 100) * 15;
        }
        
        else if(units <= 300){
            bill = 100 * 10 + 100 * 15 + (units - 200) * 20;
        }
        else{
            bill = 100 * 10 + 100 * 15 + 100 * 20 + (units - 300) * 25;
        }
        
        System.out.println("The Electricity Bill is "+bill);
        
    }
    
}