import java.util.Scanner;

public class Cash {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Prompt the user for change owed, in cents
        int cents;

        do {
            System.out.print("Change owed: ");
            cents = scn.nextInt();
        } while (cents < 0);

        // Function call
        cashCalc(cents);

        scn.close();
    }

    // Function definition
    public static void cashCalc(int cents) {

        // Calculate quarters
        int quarters = calcQuarters(cents);
        cents = cents - (quarters * 25);

        // Calculate dimes
        int dimes = calcDimes(cents);
        cents = cents - (dimes * 10);

        // Calculate nickels
        int nickels = calcNickels(cents);
        cents = cents - (nickels * 5);

        // Calculate pennies
        int pennies = calcPennies(cents);
        cents = cents - (pennies * 1);

        // Calculate total number of coins
        int coins = quarters + dimes + nickels + pennies;

        // Print the answer
        System.out.println(coins);
    }

    public static int calcQuarters(int cents) {
        return cents / 25;
    }

    public static int calcDimes(int cents) {
        return cents / 10;
    }

    public static int calcNickels(int cents) {
        return cents / 5;
    }

    public static int calcPennies(int cents) {
        return cents / 1;
    }
}
