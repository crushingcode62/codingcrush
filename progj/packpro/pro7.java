
            // Emp.java
            package employee;
            
            public class Emp {
                String name;
                int empid;
                String category;
                double bpay;
                double hra;
                double da;
                double npay;
                double pf;
                double grosspay;
                double incometax;
                double allowance;
            
                // Parameterized constructor
                public Emp(String name, int empid, String category, double bpay, double hra, double da, double allowance) {
                    this.name = name;
                    this.empid = empid;
                    this.category = category;
                    this.bpay = bpay;
                    this.hra = hra;
                    this.da = da;
                    this.allowance = allowance;
                }
            
                // Method to calculate net pay
                public void calculateNetPay() {
                    grosspay = bpay + hra + da + allowance;
                    pf = 0.12 * bpay; // Assuming PF deduction is 12% of basic pay
                    incometax = 0.10 * grosspay; // Assuming Income Tax deduction is 10% of gross pay
                    npay = grosspay - (pf + incometax);
                }
            
                // Method to display employee details and calculated values
                public void displayDetails() {
                    System.out.println("Employee Details:");
                    System.out.println("Name: " + name);
                    System.out.println("Employee ID: " + empid);
                    System.out.println("Category: " + category);
                    System.out.println("Basic Pay: " + bpay);
                    System.out.println("HRA: " + hra);
                    System.out.println("DA: " + da);
                    System.out.println("Allowance: " + allowance);
                    System.out.println("Gross Pay: " + grosspay);
                    System.out.println("PF Deduction: " + pf);
                    System.out.println("Income Tax Deduction: " + incometax);
                    System.out.println("Net Pay: " + npay);
                }
            }
            
            // Emppay.java
            import employee.Emp;
            
            public class Emppay {
                public static void main(String[] args) {
                    // Create an object of the Emp class
                    Emp e = new Emp("John Doe", 101, "Manager", 50000.0, 15000.0, 10000.0, 5000.0);
            
                    // Call the calculateNetPay method to perform calculations
                    e.calculateNetPay();
            
                    // Call the displayDetails method to print employee details and calculated values
                    e.displayDetails();
                }
            }