import java.util.ArrayList;

class Student {
    private String name;
    private int grade;
    private ArrayList courses;

    // Constructor to initialize name, grade, and courses
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public ArrayList getCourses() {
        return courses;
    }

    // Method to add a course
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println(course + " added for " + name);
        } else {
            System.out.println(name + " is already enrolled in " + course);
        }
    }

    // Method to remove a course
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(course + " removed for " + name);
        } else {
            System.out.println(name + " is not enrolled in " + course);
        }
    }
}

public class StudentExample {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student1 = new Student("Alice", 10);

        // Display student details
        System.out.println("Student Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Grade: " + student1.getGrade());
        System.out.println("Courses: " + student1.getCourses());

        // Add courses for the student
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("History");

        // Display updated courses for the student
        System.out.println("\nUpdated Courses: " + student1.getCourses());

        // Remove a course for the student
        student1.removeCourse("Science");

        // Display updated courses for the student
        System.out.println("Updated Courses: " + student1.getCourses());
    }
}
