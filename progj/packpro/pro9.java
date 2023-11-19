// SampleClass.java
            package c4.sample;
            
            public class SampleClass {
                // Protected members
                protected String sampleName;
                protected int sampleId;
                protected double sampleValue;
            
                // Constructor
                public SampleClass(String sampleName, int sampleId, double sampleValue) {
                    this.sampleName = sampleName;
                    this.sampleId = sampleId;
                    this.sampleValue = sampleValue;
                }
            }
            
            // AnotherClass.java
            import c4.sample.SampleClass;
            
            public class AnotherClass {
                public static void main(String[] args) {
                    // Create an object of the SampleClass from the nested package
                    SampleClass sampleObject = new SampleClass("NestedSample", 202, 42.0);
            
                    // Access protected members of the SampleClass
                    System.out.println("Sample Details:");
                    System.out.println("Sample Name: " + sampleObject.sampleName);   // Access protected variable
                    System.out.println("Sample ID: " + sampleObject.sampleId);       // Access protected variable
                    System.out.println("Sample Value: " + sampleObject.sampleValue); // Access protected variable
                }
            }