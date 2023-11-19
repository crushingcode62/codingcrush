class p84{
public static void main(String[] args) 
{   

        int[] numbers = new int[]{20, 30, 25, 35, -16,15};
        int sum = 0;
        System.out.println("Array: ");
        for(int x : numbers)
        System.out.println(x);

        for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
       
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 
   }
}