import java.util.Arrays;
import java.util.Collections;

public class p101 {
    public static void main(String[] args) {
        Integer[] numbers = { 5, 1, 7, 8, 9, 3 };
        System.out.println("\nArray :" + Arrays.toString(numbers));
      
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("\nArray sorted in descending order:" + Arrays.toString(numbers));
    }

}
