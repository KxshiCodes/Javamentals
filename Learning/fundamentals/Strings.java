import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        comparePassword(scn);  // Password Method Call
        exploreStringMethods(); // String Methods Call

        scn.close(); // Close Scanner to avoid resource leaks
    }

    // Create Methods because I combined two different programs

    // Create comparePassword method
    private static void comparePassword(Scanner scn) {
        System.out.print("Password? ");
        String password = scn.nextLine();

        // .equals() used to check if text is the same
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }

    // Create exploreStringMethods
    private static void exploreStringMethods() {
        String message = "  Hello World!!  ";

        System.out.println(message.endsWith("  ")); // Checks if the message ends with two spaces.
        System.out.println(message.length()); // Returns the number of characters.
        System.out.println(message.indexOf("H")); // Returns the index of the first "H".
        System.out.println(message.replace("!", " *")); // Replaces every "!" with " *".
        System.out.println(message.toLowerCase()); // Converts the message to lowercase.
        System.out.println(message.toUpperCase()); // Converts the message to uppercase.
        System.out.println(message.trim()); // Removes spaces at the beginning and end.
    }
}