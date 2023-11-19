public class p85 
{
      public static void main(String args[]){
      int[] myArray = {55, 45, 69, 44};
      int num = 69;
      System.out.println("Array: ");
      for(int x : myArray)
      System.out.println(x);
      
      System.out.println("Search a specific value: "+ num);

      for(int i = 0; i<myArray.length; i++){
         if(num == myArray[i]){
            System.out.println("Array contains the "+num+" at "+ (i+1)+" location.");
         }
      }
   }
}