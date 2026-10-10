import java.util.Scanner;

public class SquareRoot {

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

// Things I've discovered
/*
- 'Math.sqrt()' squareroots the sum 
- 'Math.round()' rounds it to the nearest int
*/ 

// Things I got stuck on
/* 
- My original code was working but it kept outputing in decimal form
*/

// Things I can now do
/*
- Calculate the squared or squaredroot of sum
- Round the results to the nearest int
*/