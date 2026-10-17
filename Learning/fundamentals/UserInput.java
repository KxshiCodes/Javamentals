import java.util.Scanner; // Import reader package

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

        scn.close(); // Close scanner to prevent resource leaks 

    }
}


