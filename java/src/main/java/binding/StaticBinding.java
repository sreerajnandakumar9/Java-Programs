package binding;

// Main class
class StaticBinding {

    // Static nested inner class
    // Class 1
    public static class Animal {

        // Method of inner class
         void print()
        {

            // Print statement
            System.out.println("superclass is called");
        }
    }

    // Static nested inner class
    // Class 2
    public static class Dog extends Animal {

        // Method of inner class
         void print()
        {

            // print statement
            System.out.println("subclass is called");
        }
    }

    // Method of main class
    // Main driver method
    public static void main(String[] args)
    {

        // Creating objects of static inner classes
        // inside main() method
        Animal A = new Animal();
        Animal B = new Dog();

        // Calling method over above objects
        A.print();
      //  B.print();
    }
}