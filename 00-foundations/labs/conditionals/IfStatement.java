import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int age = scn.nextInt();

        if (age < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }
    }
}

// Things I've discovered
/* 
- An if statement runs code when a condition is true.
- else runs when none of the previous conditions are true.
- Conditions use comparison operators such as >, <, ==, <=, => and !=.
- Curly braces {} define the block of code belonging to a condition.
*/

// Things I got stuck on


// Things I can now do
/*
- Use if statements to make decisions.
- Use else as a final fallback.
- Combine conditions with comparison operators.
*/