public class EvenLength {  
    public static void main(String str[] ) {  
        String s = "This is the java even length word program ";  
          
        String[] words = s.split(" ");  
        System.out.println("Given String is : "+ s);
          
        for(String word : words) {  
            if(word.length() % 2 == 0) {  
                System.out.println(word);  
            }  
        }  
    }  
}  