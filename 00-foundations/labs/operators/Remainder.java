import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number: ");
        int number = scn.nextInt();

        if (number % 2 == 0){
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    
    }
}

// Things I've discovered
/* 
- Muddulo operator is rarely used but is handy to check the divisibilty of a number
*/

// Things I got stuck on

// Things I can now do
/* 
- Use Mudulo to find the remainder of numbers and also find even or odd numbers
*/