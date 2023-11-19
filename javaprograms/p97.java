import java.util.*;

class p97 {
   static void print(int arr[], int n){
      System.out.print("\nArray after segregation is ");
      for (int i = 0; i < n; ++i)
         System.out.print(arr[i] + " ");
	}
	public static void main(String[] args){
       int arr[] = new int[] { 0, 1, 0, 1, 1, 1,0 };
       int n = arr.length;
        System.out.println("Array: ");
      for(int x : arr)
      System.out.print(x+" ");
       Arrays.sort(arr);
       print(arr, n);
   }
}