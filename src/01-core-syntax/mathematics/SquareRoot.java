import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("First number: ");
        int a = scn.nextInt();

        System.out.print("Second number: ");
        int b = scn.nextInt();

        int sum = a + b;
        double squareRoot = Math.sqrt(sum);

        System.out.println("Square root: " + squareRoot);

        scn.close();
    }
}
