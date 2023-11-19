
            package mypackage;

            class Class1 {
                public void display() {
                    System.out.println("This is Class1");
                }
            }
            
            class Class2 {
                public void display() {
                    System.out.println("This is Class2");
                }
            }
            
            class Class3 {
                public void display() {
                    System.out.println("This is Class3");
                }
            }
            
            class Class4 {
                public void display() {
                    System.out.println("This is Class4");
                }
            }
            
            public class MainClass {
                public static void main(String[] args) {
                    // Create instances of each class
                    Class1 obj1 = new Class1();
                    Class2 obj2 = new Class2();
                    Class3 obj3 = new Class3();
                    Class4 obj4 = new Class4();
            
                    // Call functions from each class
                    obj1.display();
                    obj2.display();
                    obj3.display();
                    obj4.display();
                }
            }