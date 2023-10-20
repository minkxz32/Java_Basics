package into_java_basics;

public class loop {
    public static void main(String[] args) {
        int maxNum = 5;
        int i;

        // for loop
        System.out.println("For Loop:");
        for (i = 1; i <= maxNum; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line

        // while loop
        System.out.println("While Loop:");
        i = 1; // Reset i to 1
        while (i <= maxNum) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // New line

        // do-while loop
        System.out.println("Do-While Loop:");
        i = 1; // Reset i to 1
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= maxNum);
    }
}








