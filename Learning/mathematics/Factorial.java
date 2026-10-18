import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Prompt and Hold 
        System.out.println("Give a number");
        int n = Integer.valueOf(scn.nextLine());

        int factorial = 1; // Declare variable

        // Start at 1, repeat until i reaches n, increase i by 1 each time
        for (int i = 1; i <= n; i++){
            factorial *= i; // Multiply factorial by the current value of i
        }
        System.out.println("Factorial: " + factorial); // Print

        scn.close();
    }
    
}

