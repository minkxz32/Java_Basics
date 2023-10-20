package into_java_basics.s_topic;

import java.util.Scanner;


public class looping {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    do {
      // Take numbers as input
      System.out.print("Enter First Number: ");
      int first = sc.nextInt();
      System.out.print("Enter Second Number: ");
      int second = sc.nextInt();

      // Print the choice list
      System.out.println(
        "Enter your choice \n1 Add\n2 Subtract\n3 Multiply\n4 Divide"
      );

      // Perform the required operation
      switch (sc.nextInt()) {
        case 1:
          first += second;
          break;
        case 2:
          first -= second;
          break;
        case 3:
          first *= second;
          break;
        case 4:
          first /= second;
          break;
      }

      // Print the output
      System.out.println("Result is " + first + ".");
      System.out.println("To continue enter 1, to exit enter 0");
    } while (1 == sc.nextInt()); // test Expression
  }
    
}
