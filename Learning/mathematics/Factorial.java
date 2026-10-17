
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give a number");
        int n = Integer.valueOf(scn.nextLine());

        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

    }
}

// Things I've discovered
/**
 * Factorials are used in 'probability calculus' when examining different possible orders of a set.
 * It's also to calculate combinations.
*/ 

// Things I got stuck on
/** */

// Things I can now do
/** */