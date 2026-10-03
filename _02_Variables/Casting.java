package _02_Variables;

public class Casting {
    public static void main(String[] args) {

        // Implicit casting
        // Smaller compatible type → larger compatible type
        short x = 1;
        int y = x + 2;

        System.out.println(y);

        // Explicit casting
        // Larger type → smaller type
        double a = 1.1;
        int b = (int) a + 2;

        System.out.println(b);

        // Converting a String to an int
        String c = "1";
        int d = Integer.parseInt(c) + 2;

        System.out.println(d);
    }
}

// Things I've discovered
// - Implicit casting happens automatically when converting to a compatible larger type.
// - Explicit casting requires me to tell Java which type I want.
// - I can use (int) to convert a double to an int.
// - Casting a double to an int removes the decimal part.
// - Integer.parseInt() converts a String into an int.

// Things I got stuck on
// -

// Things I can now do
// - Convert a smaller numeric type to a larger numeric type.
// - Explicitly cast a value to another type.
// - Convert a String containing a number into an int.