  // Employee.java
            package employee;
            
            public class Employee {
                // Protected members
                protected String name;
                protected int empId;
                protected double salary;
            
                // Constructor
                public Employee(String name, int empId, double salary) {
                    this.name = name;
                    this.empId = empId;
                    this.salary = salary;
                }
            }
            
            // Payroll.java
            import employee.Employee;
            
            public class Payroll {
                public static void main(String[] args) {
                    // Create an object of the Employee class
                    Employee employee = new Employee("John Doe", 101, 50000.0);
            
                    // Access protected members of the Employee class
                    System.out.println("Employee Details:");
                    System.out.println("Name: " + employee.name);   // Access protected variable
                    System.out.println("Employee ID: " + employee.empId);   // Access protected variable
                    System.out.println("Salary: " + employee.salary);   // Access protected variable
                }
            }
          