import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("First number: ");
        int a = scn.nextInt();

        System.out.print("Second number: ");
        int b = scn.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (double) a / b);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        scn.close();
    }
}
