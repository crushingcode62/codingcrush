import java.util.Arrays;
class p100
{
    public static void main(String[] args)
    {
       
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        System.out.println("Array before sorting: ");
        for(int x : arr)
        System.out.println(x); 
        int temp = 0;    
         for (int i = 0; i <n; i++)   
         {     
            for (int j = i+1; j < n; j++)    
            {     
               if(arr[i] > arr[j]) 
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
        System.out.println("Elements of array sorted in ascending order: ");    
        for(int x : arr)
        System.out.println(x);  
    }
}