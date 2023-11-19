class p113
 {
  public static void main(String[] args) 
  {
    int x = 50;
    int y = 100;
    int hcf = 1;
    int temp;

    if (x > y) {
      temp = x;
      x = y;
      y = temp;
    }

    for(int i = 1; i < (x+1); i++) {
      if (x%i == 0 && y%i == 0)
        hcf = i;
    }
    System.out.println("HCF of "+ x +" and "+ y +" is: "+ hcf);
  }
}