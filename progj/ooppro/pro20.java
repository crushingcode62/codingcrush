class MyClass {
    // Default constructor
    public MyClass() {
        System.out.println("This is the default constructor.");
    }

    public void displayMessage() {
        System.out.println("Hello from MyClass!");
    }
}

public class DefaultConstructorExample {
    public static void main(String[] args) {
        // Creating an object of MyClass, which will invoke the default constructor
        MyClass myObject = new MyClass();

        // Calling a method of the class
        myObject.displayMessage();
    }
}