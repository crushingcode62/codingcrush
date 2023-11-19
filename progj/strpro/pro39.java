public class ReplaceSpace  
{  
    public static void main(String str[] ) {  
        String s = "This is replace the space program";  
        char ch = '-'; 
        System.out.println(s); 
        System.out.println("Space Replace with : - character"); 
        s = s.replace(' ', ch);  
          
        System.out.println("String after replacing spaces with given character: ");  
        System.out.println(s);  
    }  
}   