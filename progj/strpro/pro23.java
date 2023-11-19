/* Program to find Reverse of the string */

public class strings23{
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String inputString = "Java Programs";
        System.out.println("Given String: "+ inputString);
        String reversedString = reverseString(inputString);
        System.out.println("Reverse String: "+reversedString);
    }
}