package _03_Logic.controlflow;

public class Loops {
    public static void main(String[] args) {

        // FOR LOOP
        // Use when I know how many times I want the loop to run.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World " + i);
        }


        // WHILE LOOP
        // Use when I don't know exactly how many times
        // I want the loop to run.
        int i = 1;

        while (i <= 5) {
            System.out.println("Hello World " + i);
            i++;
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
// - A for loop is useful when I know how many times I want to repeat something.
// - A while loop is useful when I don't know exactly how many times
//   the loop will run.
// - A do-while loop always runs at least once before checking its condition.
// - A loop needs a condition that eventually becomes false.
// - I can use a counter to control how many times a loop runs.

// Things I got stuck on
// -

// Things I can now do
// - Create a for loop.
// - Create a while loop.
// - Create a do-while loop.
// - Control a loop using a counter.
// - Choose a loop based on what I'm trying to accomplish.