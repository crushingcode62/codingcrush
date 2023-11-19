public class prog20 {

  public static void main(String arg[])
  {
    int n=100,sum=0,i=1,j;
    
    int t=n;
    while(n!=0)
    {
      int count=0;
      for(j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          count++;
        }
      }
      if(count==2)
      {
        sum=sum+i;
        n--;
      }
      i++;
    }
    System.out.println("Sum of first "+t+" prime numbers is "+sum);
  }
}

