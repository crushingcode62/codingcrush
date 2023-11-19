class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
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

public class CopyConstructorExample {
    public static void main(String[] args) {
        // Creating an object of Person with a parameterized constructor
        Person person1 = new Person("John Doe", 25);

        // Displaying information for the original person
        System.out.println("Original Person Information:");
        person1.displayInfo();

        // Creating a new object using the copy constructor
        Person person2 = new Person(person1);

        // Displaying information for the copied person
        System.out.println("\nCopied Person Information:");
        person2.displayInfo();

        // Modifying the original person's information
        person1.setName("Jane Smith");
        person1.setAge(30);

        // Displaying information after modification
        System.out.println("\nOriginal Person Information after Modification:");
        person1.displayInfo();

        // Displaying information for the copied person to show that it remains unchanged
        System.out.println("\nCopied Person Information after Modification:");
        person2.displayInfo();
    }
}