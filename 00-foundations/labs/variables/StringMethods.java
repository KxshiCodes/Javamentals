public class StringMethods {
    public static void main(String[] args) {
        String message = "  Hello World!!  ";

        // Common String methods
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}

// Things I've discovered
/* - A String stores a sequence of characters.
- Strings have built-in methods for working with text.
- endsWith() checks whether a String ends with specific characters.
- length() returns the number of characters in a String.
- indexOf() returns the position of a character or piece of text.
- replace() replaces characters or text with something else.
- toLowerCase() converts text to lowercase.
- toUpperCase() converts text to uppercase.
 - Integer.valueOf converts a string to an integer
*/

// Things I got stuck on

/* Things I can now do
- Create and store a String.
- Check whether a String ends with specific text.
- Find the length of a String.
- Find the position of a character.
- Replace characters in a String.
- Change a String to uppercase or lowercase.
- Remove leading and trailing whitespace.
*/