package _03_ControlFlow.controlflow;

public class IfStatements {
    public static void main(String[] args) {

        int temperature = 42;

        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temperature > 25) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }
    }
}

// Things I've discovered
// - An if statement runs code when a condition is true.
// - else if lets me check another condition.
// - else runs when none of the previous conditions are true.
// - Conditions use comparison operators such as >, <, ==, and !=.
// - Curly braces {} define the block of code belonging to a condition.

// Things I got stuck on
// -

// Things I can now do
// - Use if statements to make decisions.
// - Use else if for additional conditions.
// - Use else as a final fallback.
// - Combine conditions with comparison operators.

