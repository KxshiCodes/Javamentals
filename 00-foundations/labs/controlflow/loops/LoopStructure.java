import java.util.Scanner;

public class LoopStructure {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numCounter = 0;
        int even = 0;
        int odd = 0;
    
        while (true){
            int num = Integer.valueOf(scn.nextLine()); // 1. Read
            
            // Stop if the user enters -1
            if (num == -1){
                System.out.println("Thx! Bye!");
                break;
            }

            // Count and add the number
            sum += num; // Sum of numbers
            numCounter++; // Amount of numbers entered

            // Check if even or odd
            if (num % 2 == 0){
                even++;
            } else{
                odd++;
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("Numbers: " + numCounter);

        if (numCounter > 0){
            System.out.println("Average: " + (double) sum / numCounter);
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scn.close();
    }
}

// Things I've discovered
/** 
 * Breaking a big program into smaller parts makes it easier to solve.
 * I need to figure out the types of parts the program needs to function then implement them
 * one part at a time
 * Test the program after adding each part
*/

// Things I got stuck on
/**
 * knowing what I want to implement then losing my train of thought becuase i tried to complete the full project all at once
 * 

*/

// Things I can now do
/**
 * Break the problem into smaller parts to complete roughly 85% of the code and then figure out the rest.

*/