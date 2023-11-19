class Main {
   public static void main(String args[]){
      int temp, size;
      int array[] = {10, 20, 25, 63, 96, 57};
      size = array.length;
      System.out.println("Given Array: ");
      for (int element: array)
      {
            System.out.println(element);
      }
      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){
            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("2nd Smallest element of the array is:: "+array[0]);
   }
}