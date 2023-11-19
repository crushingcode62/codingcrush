import java.util.Scanner;
public class prog14 {

    public static void main(String[] args) {
        int n,m;

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer : ");
        n = in.nextInt();
        
        // Display the number in a specific pattern.
        System.out.printf("%d + %d%d  + %d%d%d", n, n, n, n, n, n);

        m = n + 11*n + 111*n;
		System.out.println(" = " + m);
    }
}
