package into_java_basics;


public class Instance_Variable {
   // Instance variables
    String name;
    int age;

    // Constructor to initialize instance variables
    public Instance_Variable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the dog
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // Creating instances of the Dog class
        Instance_Variable intancevariable = new Instance_Variable("Buddy", 3);
        Instance_Variable instavariable = new Instance_Variable("Max", 5);

        // Accessing and displaying instance variables
        intancevariable.displayInfo();
        instavariable.displayInfo();
    }
}
