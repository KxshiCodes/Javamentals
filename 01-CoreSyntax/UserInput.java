import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read a String
        System.out.print("Enter your name: ");
        String name = scn.nextLine().trim();
        System.out.println("Hello, " + name + "!");

        // Read an int
        System.out.print("Enter your age: ");
        int age = scn.nextInt();
        System.out.println("You are " + age + " years old.");

        // Read a double
        System.out.print("How tall are you (meters)? ");
        double height = scn.nextDouble();
        System.out.println("You are " + height + " meters tall.");

        scn.close();
    }
}


