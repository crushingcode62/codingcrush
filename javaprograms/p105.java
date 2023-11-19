import java.util.Scanner;

public class p105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        System.out.println("Total Marks: " + totalMarks);

        double percentage = (double) totalMarks / (numSubjects * 100) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}
