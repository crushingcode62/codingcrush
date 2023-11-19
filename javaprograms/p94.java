class p94 {
   public static void main(String args[]){
      int temp, size;
      int array[] = {110, 20, 251, 63, 96, 5};
      size = array.length;

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){
            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("Array: ");
      for(int x : array)
      System.out.println(x);
      System.out.println("2nd Smallest element of the array is:: "+array[1]);
   }
}


