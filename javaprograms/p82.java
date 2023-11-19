class p82 {
    static int arr[] = { 12, 3, 4, 15 };
 
    static int sum()
    {
        int sum = 0; 
        int i;
 System.out.println("Array: ");
           for (i = 0; i < arr.length; i++)
          {
           System.out.println(arr[i]);
          }

        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
 
    
    public static void main(String[] args)
    {



        System.out.println("Sum of given array is "
                           + sum());
    }
}
