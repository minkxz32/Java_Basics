package into_java_basics;

// MyClassFile.java (source file name)
public class give_multiple_classes_to_a_source_file {
    public static void main(String[] args) {
        System.out.println("This is the main class.");
        
        // Creating an object of the Utility class
        UtilityClass utility = new UtilityClass();
        utility.displayMessage();
        
        // Creating an object of the Helper class
        HelperClass helper = new HelperClass();
        helper.printInfo();
    }
}
class UtilityClass {
    public void displayMessage() {
        System.out.println("This is the UtilityClass.");
    }
}

class HelperClass {
    public void printInfo() {
        System.out.println("This is the HelperClass.");
    }
}
