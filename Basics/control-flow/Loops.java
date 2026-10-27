import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in); 
            
            // Method call
            countToNumber(scn);
            printFruits();
            calculateSquares(scn);

            scn.close();
        }

    // Create countToNumber Method
    private static void countToNumber(Scanner scn) {
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scn.nextLine());

        for (int i = 0; i <= number; i++) {
            System.out.println("Hello World " + i);
        }
    }

    // Create printFruits Method
    private static void printFruits() {
        String[] fruits = {"Apple", "Mango", "Orange"};

        // Use a regular for loop when the index matters.
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Use a for-each loop when accessing each item.
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    // Create calculateSquare Method
    private static void calculateSquares(Scanner scn) {
        while (true) {
            System.out.print("Give a number (0 to quit): ");
            int number = Integer.parseInt(scn.nextLine());

            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            if (number == 0) {
                break;
            }

            System.out.println(number * number);
        }
    }
}