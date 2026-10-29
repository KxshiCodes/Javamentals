import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // if / else if / else
        System.out.print("Enter your age: ");
        int age = scn.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Invalid age.");
        } else if (age < 18) {
            System.out.println("You are not an adult.");
        } else {
            System.out.println("You are an adult.");
        }

        // Multiple conditions
        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Grading with else if
        System.out.print("Enter points [0-100]: ");
        int points = scn.nextInt();

        if (points < 0 || points > 100) {
            System.out.println("Invalid points.");
        } else if (points < 50) {
            System.out.println("Failed");
        } else if (points < 60) {
            System.out.println("Grade: 1");
        } else if (points < 70) {
            System.out.println("Grade: 2");
        } else if (points < 80) {
            System.out.println("Grade: 3");
        } else if (points < 90) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }

        // switch with String
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You are an admin.");
                break;
            case "moderator":
                System.out.println("You are a moderator.");
                break;
            default:
                System.out.println("You are a guest.");
        }

        scn.close();
    }
}
