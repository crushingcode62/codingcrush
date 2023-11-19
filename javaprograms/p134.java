import java.text.DecimalFormat;
class p134 
{
       public static void main(String[] args) 
       {
        float number = 3.14159f; 
        int decimalPlaces = 2; 
        String pattern = "#.";
        for (int i = 0; i < decimalPlaces; i++) {
            pattern += "#";
        }
        DecimalFormat decimalFormat = new DecimalFormat(pattern);    
        String roundedNumber = decimalFormat.format(number);
        System.out.println("Original number: " + number);
        System.out.println("Rounded number with " + decimalPlaces + " decimal places: " + roundedNumber);
    }
}
