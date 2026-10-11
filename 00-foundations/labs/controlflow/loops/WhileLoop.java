import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Reads User input

        // Repeats the block until exited
        while (true){
            System.out.println("Give a number:"); // Prompt User for input
            int num = Integer.valueOf(scn.nextLine()); // Read Users input
          
            // Conditionals to guard and prevent unfit numbers
            if (num < 0){
                System.out.println("Unsuitable number");
                continue;
            } else if (num == 0){ // check if loop is exited
                break;
            } else {
                System.out.println(num * num ); // Print the square of the number
            }
        
        }
        scn.close();
    }
}

// Things I've discovered
/**
 * Loops are useful when I know how many times I want to repeat something.
 * Use a counter to control how many times a loop runs.
 * While loop is useful when I don't know exactly how many times the loop will run.
 * continue = skip the rest of this iteration and start the next one.
 * break = stop the loop completely.
 */


// Things I got stuck on


// Things I can now do
/**
 * Create a while loop.
 * Control a loop using a counter.
 * Use the 'break' and 'continue' commands.
 * Choose a loop based on what I'm trying to accomplish.
*/