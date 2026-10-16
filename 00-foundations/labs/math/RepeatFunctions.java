import java.util.Scanner;

public class RepeatFunctions {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("First number?");// Prompt User
        int firstNum = Integer.valueOf(scn.nextLine());// Read User Prompt

        System.out.println("Second number?");// Prompt User
        int secNum = Integer.valueOf(scn.nextLine());// Read User Prompt

        int sum = 0; // Declare Sum

        // Execute from start number through to end number, add 1 for each repetition
        for (int i = firstNum; i <= secNum; i++){
            sum += i; // Add the each repetition altogether and give sum
        }
        System.out.println("The sum is " + sum);
        scn.close();
    }
}

// Things I've discovered
/**
 * Repeating Functionality:
 * Repetition is common in these loops some functionality is done repeatedly, and a counter variable is used to keep track of the repetitions.
*/ 

// Things I got stuck on
/** 
 * 

// Things I can now do
/**
 * 
*/