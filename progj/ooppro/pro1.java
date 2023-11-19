class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
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
}

public class PersonExample {
    public static void main(String[] args) {
        // Create two instances of the Person class
        Person person1 = new Person("John Doe", 25);
        Person person2 = new Person("Jane Smith", 30);

        // Print details of the first person
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Print details of the second person
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}