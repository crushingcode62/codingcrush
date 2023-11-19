public class CarDemo {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Set values using setter methods
        myCar.setCompany_name("Toyota");
        myCar.setModel_name("Camry");
        myCar.setYear(2022);
        myCar.setMileage(30.5);

        // Display values using getter methods
        System.out.println("Company Name: " + myCar.getCompany_name());
        System.out.println("Model Name: " + myCar.getModel_name());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());
    }
}