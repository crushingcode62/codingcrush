//Java Program to divide a string into n equal parts
public class pro19 
{ 
    // Method to divide a string into n equal parts
    static void divide(String str, int n) 
    { 
    
        int sub_size; 
        // Check whether the string can be divided into n equal parts  
        if (str.length() % n != 0) 
        { 
            System.out.println("Invalid Input"); 
            System.out.println("String size is not divisible by n"); 
            System.out.println("Try Again"); 
            return; 
        } 
      
        // Calculate the number of parts to find the division points 
        sub_size = str.length() / n; 
          
        for (int i = 0; i< str.length(); i++) 
        { 
            if(i % sub_size == 0) 
            System.out.println();  
            System.out.print(str.charAt(i)); 
        } 
    } 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        
        String str = "abcdefghijklmnopqr"; 
        System.out.println("The entered string is: "+str);
        int n=3;
        System.out.println("On dividing the entered string into "+ n +" equal parts, we have ");
        // Print n equal parts of the string 
        divide(str, n); 
    } 
} 