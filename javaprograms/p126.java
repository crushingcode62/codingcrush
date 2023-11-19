class p126
{
  public static double rectangle(double l,double b)
  {
    double area;
    area=2*l+2*b;
    return area;
  }
  public static void main(String x[])
  { 
    System.out.println("Length of Rectangle : 10 " );
    System.out.println("Length of Rectangle : 20 " );
    System.out.print("Area of Rdectanlge using method:"+rectangle(10.00,20.00 ));
}
}