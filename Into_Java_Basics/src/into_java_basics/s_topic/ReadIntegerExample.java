package into_java_basics.s_topic;

import java.util.Scanner;

public class ReadIntegerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        sc.close();
    }
}


