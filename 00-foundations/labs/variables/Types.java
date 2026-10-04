import java.util.Date;

public class Types {
    public static void main(String[] args) {

        // Primitive types
        byte age = 27;
        int year = 2026;
        long viewCount = 2_200_456_800L;
        float pspPrice = 63.75F;
        char gender = 'M';
        boolean isEligible = true;

        // Reference types
        Date now = new Date();

        System.out.println(now);
    }
}

// Things I've discovered
// - Primitive types store simple values.
// - Java has 8 primitive types: byte, short, int, long, float, double, char, and boolean.
// - Reference types refer to objects.
// - Examples of reference types include String, Date, arrays, and custom classes.
// - Underscores can make large numbers easier to read, e.g. 2_200_456_800.
// - L tells Java that a number is a long.
// - F tells Java that a decimal number is a float.
// - An object is a thing created from a class.
// - An instance is a specific object created from a class.
// - A class is like a blueprint, and an object/instance is something built from that blueprint.

// Things I got stuck on
// - The concept or difference between Class, Objects and instances

// Things I can now do
// - Declare variables using different primitive types.
// - Store whole numbers, decimal numbers, characters, and boolean values.
// - Create a Date object.
// - Distinguish between primitive types and reference types.