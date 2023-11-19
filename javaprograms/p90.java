import java.util.Arrays; 
public class p90 
{
  public static void main(String[] args) 
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
        System.out.println("Array: ");
        for(int x : my_array)
        System.out.print(x+" ");
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("\nDuplicate Element : "+my_array[j]);
                }
            }
        }
    }    
}
