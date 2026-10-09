import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password? ");
        String password = scn.nextLine();


        if (password.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}

// Things I've discovered
/* 
- .equals command is used to compare strings
- I can't compare the equality of strings the same way i would compare Ints, integers, floating point numbers, and boolean values using "=="
*/

// Things I got stuck on

// Things I can now do
/* 
- Compare strings with .equals command
*/