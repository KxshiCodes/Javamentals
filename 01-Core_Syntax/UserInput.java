import java.util.Scanner; // Import reader package

public class UserInput {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Scanner tool to read user input

        System.out.println("Enter your name: "); // Prompt User for name
        String name = scn.nextLine().trim(); // Read String input, trim white spaces
        System.out.println("Hello, " + name + "!"); // Print + Concatenation   

        System.out.println("Enter your age: "); // Prompt User for age
        int age = scn.nextInt(); // Read int input
        System.out.println("You are " + age + " years old."); 

        System.out.println("How tall are you: "); // Prompt User height
        Double height = scn.nextDouble(); // Read input
        System.out.println("You are " + height + " meters tall.");     

        scn.close(); // Close scanner to prevent resource leaks 

    }
}


