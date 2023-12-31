class Dog {
    private String name;
    private String breed;

    // Constructor to initialize name and breed
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class DogExample {
    public static void main(String[] args) {
        // Create two instances of the Dog class
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Print initial details of the dogs
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modify the attributes using setter methods
        dog1.setName("Charlie");
        dog2.setBreed("Golden Retriever");

        // Print updated details of the dogs
        System.out.println("\nUpdated Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Updated Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}
  