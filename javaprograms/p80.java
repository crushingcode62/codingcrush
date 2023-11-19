class p80
{
    public static void main(String argsp[]) throws NumberFormatException
    {
       
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your binary number : ");
        String binary=sc.next();

        int decimal=Integer.parseInt(binary,2);
        System.out.println("Decimal number for Binary "+binary+" is "+decimal);
    }
}