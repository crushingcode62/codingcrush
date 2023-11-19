 package mypackage;

            class ClassA {
                void displayA() {
                    System.out.println("This is ClassA");
                }
            }
            
            class ClassB {
                void displayB() {
                    System.out.println("This is ClassB");
                }
            }
            
            public class MainClass {
                public static void main(String[] args) {
                    // Create instances of ClassA and ClassB
                    ClassA objA = new ClassA();
                    ClassB objB = new ClassB();
            
                    // Call methods from ClassA and ClassB
                    objA.displayA();
                    objB.displayB();
                }
            }