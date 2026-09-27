package _03_Logic.operators;

public class TernaryOp {
    public static void main(String[] args) {

        int income = 110_000;

        String className = income > 100_000 ? "First" : "Economy";

        System.out.println(className);
    }
}

// Things I've discovered
// - The ternary operator is a shorter way to write a simple if-else statement.
// - The ? separates the condition from the true result.
// - The : separates the true result from the false result.
// - The condition must produce a boolean.

// Things I got stuck on
// -

// Things I can now do
// - Use the ternary operator to make a simple decision.
// - Assign different values depending on whether a condition is true or false.
