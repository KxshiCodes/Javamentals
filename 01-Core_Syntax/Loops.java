import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // for loop: count from 1 to a number
        System.out.print("Count to: ");
        int limit = scn.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }

        // for loop: calculate a sum
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

        // for-each loop: iterate through an array
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // while loop: repeat until the user enters 0
        while (true) {
            System.out.print("Enter a number (0 to quit): ");
            int number = scn.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            System.out.println("Square: " + (number * number));
        }

        scn.close();
    }
}
