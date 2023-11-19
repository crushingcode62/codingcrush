class p92{
  public static void main(String[] args) {
    int rows = 2, columns = 4;
     int[][] matrixOne = { {1, 2, 3, 4}, {5, 6, 7, 8} };
    int[][] matrixTwo = { {0, 1, 0, 1}, {0, 1, 0, 1} };
    int[][] sumMatrix = new int[rows][columns];

    System.out.println("First matrix is: ");
    for(int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrixOne[i][j] + " ");
      }
      System.out.println();
    } 
    System.out.println("Second matrix is: ");
    for(int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrixTwo[i][j] + " ");
      }
      System.out.println();
    }
    for(int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        sumMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
      }
    }

    // Print the sum matrix
    System.out.println("Sum of two matrices is: ");
    for(int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(sumMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}