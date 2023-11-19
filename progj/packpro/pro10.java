 // MyClass.java
            package mypackage;
            
            public class MyClass {
                // Public members
                public String publicString;
                public int publicInt;
                public double publicDouble;
            
                // Constructor
                public MyClass(String publicString, int publicInt, double publicDouble) {
                    this.publicString = publicString;
                    this.publicInt = publicInt;
                    this.publicDouble = publicDouble;
                }
            }
            
            // AnotherClass.java
            import mypackage.MyClass;
            
            public class AnotherClass {
                public static void main(String[] args) {
                    // Create an object of the MyClass from the package
                    MyClass myObject = new MyClass("PublicExample", 303, 3.14);
            
                    // Access public members of the MyClass
                    System.out.println("Public Members:");
                    System.out.println("Public String: " + myObject.publicString);   // Access public variable
                    System.out.println("Public Int: " + myObject.publicInt);         // Access public variable
                    System.out.println("Public Double: " + myObject.publicDouble);   // Access public variable
                }
            }
          