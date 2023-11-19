public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Getter and setter methods for employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employeeId) {
        this.employee_id = employeeId;
    }

    // Getter and setter methods for employee_name
    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employeeName) {
        this.employee_name = employeeName;
    }

    // Getter method for formatted employee_salary
    public String getFormattedSalary() {
        return String.format("$%,.2f", employee_salary);
    }

    // Setter method for employee_salary
    public void setEmployeeSalary(double employeeSalary) {
        this.employee_salary = employeeSalary;
    }

    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee employee = new Employee();

        // Set the values using setter methods
        employee.setEmployeeId(101);
        employee.setEmployeeName("John Doe");
        employee.setEmployeeSalary(50000.75);

        // Display the values using getter methods
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getFormattedSalary());
    }
}
