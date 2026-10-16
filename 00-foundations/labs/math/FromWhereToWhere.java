import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int numTo = Integer.valueOf(scn.nextLine());
        System.out.println("Where from?");
        int numFrom = Integer.valueOf(scn.nextLine());

        for (int i = numFrom; i <= numTo; i++){
            System.out.println(i);
        }
        scn.close();
    }   
}


// Things I've discovered
/**
 * The starting point and ending point within the for loop and how it works.
*/ 

// Things I got stuck on
/** 
 * Figure out exactly what the For loops was doing and how I was using it wrong.
*/

// Things I can now do
/**
 * Almost confidently use a For loop proeprly
*/