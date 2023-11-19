import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}

class Teacher {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }
}

class SchoolClass {
    private String className;
    private Teacher teacher;
    private List students;

    public SchoolClass(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}

class School {
    private List students;
    private List teachers;
    private List classes;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student: " + student.getStudentName());
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("Removed student: " + student.getStudentName());
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Added teacher: " + teacher.getTeacherName());
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
        System.out.println("Removed teacher: " + teacher.getTeacherName());
    }

    public void createClass(String className, Teacher teacher) {
        SchoolClass schoolClass = new SchoolClass(className, teacher);
        classes.add(schoolClass);
        System.out.println("Created class: " + className + " with teacher: " + teacher.getTeacherName());
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        // Create an instance of the School class
        School mySchool = new School();

        // Add students and teachers to the school
        mySchool.addStudent(new Student("John Doe"));
        mySchool.addStudent(new Student("Jane Doe"));
        mySchool.addTeacher(new Teacher("Mr. Smith"));

        // Create a class and add students to it
        mySchool.createClass("Math Class", new Teacher("Mr. Smith"));
        SchoolClass mathClass = mySchool.classes.get(0);
        mathClass.addStudent(new Student("Alice"));
        mathClass.addStudent(new Student("Bob"));

        // Display information about the school, classes, and students
        System.out.println("\nSchool Information:");
        System.out.println("Students: " + mySchool.students.size());
        System.out.println("Teachers: " + mySchool.teachers.size());
        System.out.println("Classes: " + mySchool.classes.size());

        System.out.println("\nClass Information:");
        System.out.println("Class Name: " + mathClass.getClassName());
        System.out.println("Teacher: " + mathClass.getTeacher().getTeacherName());
        System.out.println("Students: " + mathClass.getStudents().size());
    }
}
  