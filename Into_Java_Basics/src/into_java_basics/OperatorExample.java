package into_java_basics;


public class OperatorExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        // Assignment Operators
        int x = 20;
        x += 5; // Equivalent to x = x + 5
        System.out.println("\nAssignment Operator (+=): " + x);

        // Comparison Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);

        System.out.println("\nComparison Operators:");
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater Than: " + isGreaterThan);
        System.out.println("Is Less Than: " + isLessThan);

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;

        boolean andResult = condition1 && condition2;
        boolean orResult = condition1 || condition2;
        boolean notResult = !condition1;

        System.out.println("\nLogical Operators:");
        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);
    }
}








    

