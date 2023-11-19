class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        // Creating an object of Person with a parameterized constructor
        Person person1 = new Person("John Doe", 25);

        // Accessing the data using getter methods
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Displaying information using the display method
        System.out.println("Person 1 Information:");
        person1.displayInfo();

        // Creating another object of Person with a different set of values
        Person person2 = new Person("Jane Smith", 30);

        // Displaying information for the second person
        System.out.println("\nPerson 2 Information:");
        person2.displayInfo();
    }
}