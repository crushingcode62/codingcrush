
public class Person {
    private String name;
    private int age;
    private String country;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();

        // Set the values using setter methods
        person.setName("John Doe");
        person.setAge(25);
        person.setCountry("USA");

        // Display the values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}