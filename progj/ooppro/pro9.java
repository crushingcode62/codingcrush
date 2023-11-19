import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor to initialize name, salary, and hire date
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        // Create an instance of the Employee class
        LocalDate hireDate = LocalDate.of(2015, 5, 10);
        Employee employee = new Employee("John Doe", 60000.0, hireDate);

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Hire Date: " + employee.getHireDate());

        // Calculate and display years of service
        int yearsOfService = employee.calculateYearsOfService();
        System.out.println("\nYears of Service: " + yearsOfService);
    }
}