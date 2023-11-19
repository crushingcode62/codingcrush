class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor to initialize name, job title, and salary
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Method to update the salary
    public void updateSalary(double percentageIncrease) {
        double increaseAmount = salary * (percentageIncrease / 100);
        salary += increaseAmount;
        System.out.println("Salary updated for " + name + ". New Salary: " + salary);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee employee1 = new Employee("John Doe", "Software Engineer", 60000.0);

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Job Title: " + employee1.getJobTitle());
        System.out.println("Salary: " + employee1.getSalary());

        // Calculate and display annual salary
        System.out.println("\nAnnual Salary: " + employee1.calculateAnnualSalary());

        // Update the salary by 10%
        employee1.updateSalary(10);

        // Display updated salary
        System.out.println("Updated Annual Salary: " + employee1.calculateAnnualSalary());
    }
}
