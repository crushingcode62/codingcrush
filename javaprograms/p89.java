import java.util.*; 
public class p89
{
   public static void main(String[] args) {
      int[] array1 = {4, 2, 3, 1, 6};
      int[] array2 = {6, 7, 9, 8, 4};
      
      System.out.println("First Array: ");
      for(int x : array1)
      System.out.print(x+" ");
      System.out.println("\nSecond Array: ");
      for(int x : array2)
      System.out.print(x+" ");
      System.out.println("\nCommon Elements: ");
      for (int i = 0; i < array1.length; i++) 
      {
        for (int j = 0; j < array2.length; j++) 
        {
         if(array1[i]==array2[j])
         {
           System.out.print(array1[i]+" ");
            
         }
        }
      }
   }
}
