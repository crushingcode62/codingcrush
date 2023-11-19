import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private ArrayList grades;

    // Constructor
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    // Getter and Setter methods for student_id
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    // Getter and Setter methods for student_name
    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    // Method to add a grade with validation
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added successfully.");
        } else {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student1 = new Student(1, "John Doe");

        // Display initial student information
        System.out.println("Initial Student Information:");
        System.out.println("Student ID: " + student1.getStudent_id());
        System.out.println("Student Name: " + student1.getStudent_name());

        // Add grades
        System.out.println("\nAdding Grades:");
        student1.addGrade(90.5);
        student1.addGrade(75.0);
        student1.addGrade(110.0); // This grade is invalid

        // Display final student information and grades
        System.out.println("\nFinal Student Information:");
        System.out.println("Student ID: " + student1.getStudent_id());
        System.out.println("Student Name: " + student1.getStudent_name());
        System.out.println("Grades: " + student1.grades);
    }
}
    