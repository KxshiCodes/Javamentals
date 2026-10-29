public class Strings {

    public static void main(String[] args) {

        String message = "  Hello World!!  ";

        // Comparing strings
        String password = "Caput Draconis";
        System.out.println(password.equals("Caput Draconis")); // true

        // String methods
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.endsWith("  "));
        System.out.println(message.replace("!", " *"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
