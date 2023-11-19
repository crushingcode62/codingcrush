public class p81
{
  public static void main(String[] args) 
  {    
        String str = "Hello World. How are you.";    
        int count = 0;    
        System.out.println("The entered string is: "+str);    
     
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) == '.')    
                count++;    
        }                
        //Displays the total number of characters in the string    
        System.out.println("Total number of characters in the string: " + count);    
    }      
}