
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give a number");
        int n = Integer.valueOf(scn.nextLine());

        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

    }
}

