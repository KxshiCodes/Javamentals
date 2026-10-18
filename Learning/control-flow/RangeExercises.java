import java.util.Scanner;

public class RangeExercises {

    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            // Method call
            printRange(scn);
            sumRange(scn);

            scn.close();
        }
    
    // Create printRange Method
    private static void printRange(Scanner scn) {
        System.out.print("Where to? ");
        int end = Integer.parseInt(scn.nextLine());

        System.out.print("Where from? ");
        int start = Integer.parseInt(scn.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    // Create sumRange Method
    private static void sumRange(Scanner scn) {
        System.out.print("First number? ");
        int start = Integer.parseInt(scn.nextLine());

        System.out.print("Second number? ");
        int end = Integer.parseInt(scn.nextLine());

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}