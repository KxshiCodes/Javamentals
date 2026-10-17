import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        comparePassword(scn);
        exploreStringMethods();

        scn.close();
    }

    private static void comparePassword(Scanner scn) {
        System.out.print("Password? ");
        String password = scn.nextLine();

        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }

    private static void exploreStringMethods() {
        String message = "  Hello World!!  ";

        System.out.println(message.endsWith("  "));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", " *"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}