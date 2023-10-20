package into_java_basics;

import java.util.Scanner;

public class Grade_quiz {
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
            System.out.println("Enter your grade:");
                int grade = scan.nextInt();
                
                if (grade >= 80)
                {
                    System.out.println("Pass!");
                }else{
                    System.out.println("Fail");
                }                
    }  
}
