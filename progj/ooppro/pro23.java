import java.util.Scanner;

class Student {
    private static int rollNumberCounter = 1; // Static variable to keep track of roll numbers
    private int rollNumber;
    private String name;
    private String className;

    // Parameterized constructor
    public Student(String name, String className) {
        this.rollNumber = rollNumberCounter++;
        this.name = name;
        this.className = className;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
    }
}

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store information for 10 students
        Student[] students = new Student[10];

        // Input information for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter information for Student " + (i + 1));
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter class: ");
            String className = scanner.nextLine();

            // Create a new Student object with the entered information
            students[i] = new Student(name, className);
        }

        // Display information for all students
        System.out.println("\nStudent Information:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println(); // Add a newline for better readability
        }

        scanner.close();
    }
}
   