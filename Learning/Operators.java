import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = scn.nextInt();

        if (age >= 0 && age <= 120) {
            System.out.println("Valid age.");
        } else {
            System.out.println("Impossible!");
        }

        System.out.print("Give a number: ");
        int number = scn.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

        scn.close();
    }
}

