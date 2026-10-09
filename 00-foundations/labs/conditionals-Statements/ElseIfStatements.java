import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give points [0-100]: ");
        int points = scn.nextInt();

        if (points < 0) {
            System.out.println("Grade: impossible!");
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
        } else if (points <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}

// Things I've discovered
/* 
- else if is used when multiple conditions exist.
- else runs when none of the previous conditions are true.
*/

// Things I got stuck on


// Things I can now do
/* 
- Use else if for additional conditions.
- Combine conditions with comparison operators.
*/
