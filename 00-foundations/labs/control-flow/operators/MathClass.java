public class MathClass {
    public static void main(String[] args) {

        int rounded = Math.round(1.1F);
        System.out.println(rounded);

        int roundedUp = (int) Math.ceil(1.1F);
        System.out.println(roundedUp);

        int roundedDown = (int) Math.floor(1.1F);
        System.out.println(roundedDown);

        int maximum = Math.max(1, 2);
        System.out.println(maximum);

        int minimum = Math.min(1, 2);
        System.out.println(minimum);

        double random = Math.random() * 100;
        System.out.println(random);

        long randomRounded = Math.round(Math.random() * 100);
        System.out.println(randomRounded);
    }
}

// Things I've discovered
// - Math.round() rounds a number to the nearest whole number.
// - Math.ceil() always rounds a number up.
// - Math.floor() always rounds a number down.
// - Math.max() returns the larger of two values.
// - Math.min() returns the smaller of two values.
// - Math.random() generates a random decimal between 0.0 and 1.0.
// - I can multiply Math.random() to get a larger range.
// - Some Math methods return a double, so I may need to cast the result to an int.

// Things I got stuck on
// -

// Things I can now do
// - Round numbers using the Math class.
// - Find the highest and lowest of two numbers.
// - Generate random numbers.
// - Cast a Math result from double to int.