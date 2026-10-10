import java.util.Scanner; // Making the scanner available in the program

public class UserInput {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // // Creating the scanner tool to read user input

        System.out.println("Enter your name: "); // Prompt User for name
        String name = scn.nextLine().trim(); // Read the string written by the user, trim white spaces
        System.out.println("Hello, " + name + "!"); // Print User input using Concatenation   

        System.out.println("Enter your age: "); // Prompt User for age
        int age = scn.nextInt(); // Read the int written by user
        System.out.println("You are " + age + " years old."); 

        System.out.println("How tall are you: "); // Prompt User height
        Double height = scn.nextDouble(); // Read height input in double
        System.out.println("You are " + height + " meters tall.");     

        scn.close(); // Close the scanner to prevent resource leaks 

    }
}

// Things I've discovered:
/* 
- I can use a scanner to read different types of input.
- nextLine() reads text.
- nextInt() reads integer.
- nextDouble reads a decimal number.
- .trim() removes whitespace from the beginning and end of a String.
- I can use '⌘ + Ctrl + G' to select all occurrences in IntelliJ.
- Java 25 has introduced newer alternatives to some traditional Java syntax.
  */

// Things I got stuck on:

// Things I can now do:
/*
- Read text input from user.
- Read integer input from the user.
- Read decimal input from the user
- Store user input in variables
- Print the user's input back to the console.
*/
