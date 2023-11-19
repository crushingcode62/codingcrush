class p135
{
    public static void main(String[] args) 
    {
        double number1 = 5.0;
        double number2 = 5.5;
        System.out.println(number1 + " is an integer: " + isInteger(number1));
        System.out.println(number2 + " is an integer: " + isInteger(number2));
    }
    public static boolean isInteger(double number) 
    {
        return Math.floor(number) == number;
    }
}
