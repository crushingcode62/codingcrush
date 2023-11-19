import java.io.*;
class p99 {
 
    static void printDistinct(int arr[], int n)
    {
        System.out.println("\nAll unique element in array: ");
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
            if (i == j)
            System.out.print( arr[i] + " ");
        }
    }
     
    public static void main (String[] args) 
    {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        System.out.println("Array: ");
        for(int x : arr)
        System.out.print(x+" ");
        printDistinct(arr, n);
 
    }
}
 

