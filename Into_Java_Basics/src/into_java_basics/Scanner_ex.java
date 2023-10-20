package into_java_basics;
import java.util.Scanner;

public class Scanner_ex {
    // read user input
     public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter their name
        System.out.println("Please enter your name:");
        
        // Read the user's name from the input
        
        String name = sc.next();
       
        // Print a greeting using the entered name
        System.out.println("Hello " + name);
        
        // Close the Scanner to release system resources
        sc.close();
     }
}
