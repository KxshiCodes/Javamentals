import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("How old are you? "); // Prompt for age
        int age = scn.nextInt(); // Read and hold age

        // if Statement
        // age age is less, equals to 0 and age less, equals to 120
        if (age >= 0 && age <= 120) {
            System.out.println("Valid age."); 
        } else {
            System.out.println("Impossible!");  
        }

        // Find Even and Odd numbers
        System.out.print("Give a number: ");
        int number = scn.nextInt();

        // Calculate for finding Odd and Even numbers
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

        scn.close();
    }
}

