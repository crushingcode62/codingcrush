  import java.util.*;
public class prog19 {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = in.nextInt();

        // Calculate the hours, minutes, and seconds
        int S = seconds % 60;  // Calculate the remaining seconds
        int H = seconds / 60;  // Convert total seconds to minutes
        int M = H % 60;         // Calculate the remaining minutes
        H = H / 60;            // Convert total minutes to hours

        // Display the time in the format HH:MM:SS
        System.out.print(H + ":" + M + ":" + S);

        System.out.print("\n");
    }
}