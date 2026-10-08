import java.util.Scanner;

public class ElseIfStatement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int number1 = scn.nextInt();

        System.out.println("Give the first number: ");
        int number2 = scn.nextInt();


        if (number1 > number2 ){
            System.out.println("Greater number is: " + number1);
        }  else if (number1 < number2){
            System.out.println("Greater number is: " + number2); 
        } else { 
            System.out.println("The numbers are equal!"); 
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
