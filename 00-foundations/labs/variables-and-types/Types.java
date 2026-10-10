import java.util.Scanner; // imported to read User input

public class Types {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // String Inputs
        System.out.println("Give a string: "); // Prompt User for string
        String text = scn.nextLine(); // Read User input

        // Integer Inputs
        System.out.println("Give an integer: "); // Prompt User for integer
        int wholeNum = Integer.valueOf(scn.nextLine()); // Read User integer input

        // Double Inputs
        System.out.println("Give a double: "); // Prompt User for double
        double decimalNum = Double.valueOf(scn.nextLine()); // Read User double input

        // Boolean Inputs
        System.out.println("Give a boolean: "); // Prompt User for boolean
        boolean trueOrFalse = Boolean.valueOf(scn.nextLine());

        // Print User inputs using concatenation
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + wholeNum);
        System.out.println("You gave the double " + decimalNum);
        System.out.println("You gave the boolean " + trueOrFalse);

        scn.close();

    }
}

// Things I've discovered
/* 
- Primitive types store simple values: int, long, float, double, char, and boolean.
- Reference types refer to objects (e.g. String, Date, arrays, and custom classes).
- Integer.valueOf converts a string to an integer.
- Double.valueOf converts a string to a double.
- Boolean.valueOf converts a string to a boolean.
- I can assign an integer to a variable of the double type, since Java knows (Implicit casting) how to convert an integer to a double during assignment.
*/

// Things I got stuck on
/* 
- The concept or difference between Class, Objects and instances:
- An object is a thing created from a class.
- An instance is a specific object created from a class.
- A class is like a blueprint, and an object/instance is something built from that blueprint.
*/

// Things I can now do
/*
- Declare variables using different primitive types.
- Store whole numbers, decimal numbers, characters, and boolean values.
- Distinguish between primitive types and reference types.
*/