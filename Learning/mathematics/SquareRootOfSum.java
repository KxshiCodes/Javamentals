import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number1 = Integer.valueOf(scn.nextLine());
        int number2 = Integer.valueOf(scn.nextLine());

        int result = number1 + number2;
        double squareRoot = Math.sqrt(result);
        
        System.out.println(Math.round(squareRoot));

        scn.close();
    }
}
