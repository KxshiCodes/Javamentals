package _02_Variables;

import java.util.Scanner;

public class Me {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: "); // Read user text input
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!"); // Output user text input

        System.out.print("Enter your age: "); // Reading an integer
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");// Output user integer input

        System.out.print("How tall are you: "); // Reading double input
        double height = scanner.nextDouble();
        System.out.println("You entered, " + height + " meters."); // Output user height input

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

// Things I've discovered
// - I can use Scanner to read different types of input.
// - nextLine() reads text.
// - nextInt() reads an integer.
// - nextDouble() reads a decimal number.
// - I can use '⌘ + Ctrl + G' to select all occurrences in IntelliJ.
// - Java 25 has introduced newer alternatives to some traditional Java syntax.

// Things I got stuck on
// -

// Things I can now do
// - Read text input from the user.
// - Read integer input from the user.
// - Read decimal input from the user.
// - Store user input in variables.
// - Print the user's input back to the console.