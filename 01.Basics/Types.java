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

