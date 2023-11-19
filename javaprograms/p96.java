class p96 {

 public static void main(String[] args) 
 {  
  int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};
  int smallest = numbers[0];
  int largetst = numbers[0];
  System.out.println("Array: ");
  for(int x : numbers)
  System.out.print(x+" ");

  for (int i = 1; i < numbers.length; i++) {
   if (numbers[i] > largetst)
    largetst = numbers[i];
   else if (numbers[i] < smallest)
    smallest = numbers[i];
  }

  int diff= largetst-smallest;
  System.out.println("\nLargest Number is : " + largetst);
  System.out.println("Smallest Number is : " + smallest);
   System.out.println("Difference between largest and smallest number : "+ diff);
 }
}