import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            checkAge(scn);
            calculateGrade(scn);
        }

        demonstrateSwitch();
    }

    private static void checkAge(Scanner scn) {
        System.out.print("How old are you? ");
        int age = scn.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 18) {
            System.out.println("You are not an adult.");
        } else {
            System.out.println("You are an adult.");
        }
    }

    private static void calculateGrade(Scanner scn) {
        System.out.print("Give points [0-100]: ");
        int points = scn.nextInt();

        if (points < 0 || points > 100) {
            System.out.println("Invalid points!");
        } else if (points < 50) {
            System.out.println("Grade: failed");
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
    }

    private static void demonstrateSwitch() {
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

        int roleNumber = 1;

        switch (roleNumber) {
            case 1:
                System.out.println("You are an admin.");
                break;
            case 2:
                System.out.println("You are a moderator.");
                break;
            default:
                System.out.println("You are a guest.");
        }
    }
}