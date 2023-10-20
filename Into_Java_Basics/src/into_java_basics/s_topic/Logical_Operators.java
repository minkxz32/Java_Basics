package into_java_basics.s_topic;


public class Logical_Operators {
    public static void main(String[] args) {
        int age = 34;
        boolean isStudent = true;

        // Check if a person is eligible for a student discount
        if (age <= 30 && isStudent) {
            System.out.println("You are eligible for a student discount.");
        } else {
            System.out.println("You are not eligible for a student discount.");
        }
    }
 }