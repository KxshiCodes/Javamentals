public class Loops {
    public static void main(String[] args) {

        // FOR LOOP
        // Use when I know how many times I want the loop to run.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World " + i);
        }

        // DO-WHILE LOOP
        // Runs the code at least once before checking the condition.
        int number = 1;

        do {
            System.out.println("Hello World " + number);
            number++;
        } while (number <= 5);
    }
}

// Things I've discovered
/**
 * A do-while loop always runs at least once before checking its condition.
*/
