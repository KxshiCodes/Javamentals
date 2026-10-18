import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Prompt User & Hold input
        int number1 = Integer.valueOf(scn.nextLine());
        int number2 = Integer.valueOf(scn.nextLine());

        // Calculation
        int result = number1 + number2;
        double squareRoot = Math.sqrt(result);
        
        // Print
        System.out.println(Math.round(squareRoot));

        // Close resource leak
        scn.close(); 
    }
}
