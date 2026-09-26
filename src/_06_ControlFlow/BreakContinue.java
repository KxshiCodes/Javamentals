package _06_ControlFlow;

public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }
    }
}

// Things I've discovered
// - continue skips the current iteration and moves to the next one.
// - break stops the loop completely.

// Things I got stuck on
// -

// Things I can now do
// - Skip an iteration using continue.
// - Stop a loop using break.
