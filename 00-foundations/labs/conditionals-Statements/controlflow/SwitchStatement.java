public class SwitchStatement {
    public static void main(String[] args) {

        // Switch with a String
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;

            case "moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");
        }

        // Switch with an int
        int roleNumber = 1;

        switch (roleNumber) {
            case 1:
                System.out.println("You are an admin");
                break;

            case 2:
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");
        }
    }
}

// Things I've discovered
// - A switch statement can be used to choose between multiple cases.
// - Each case checks for a specific value.
// - break stops the switch after a matching case is found.
// - default runs when none of the cases match.
// - A switch can be used with values such as String and int.
// - A simple switch can sometimes be clearer than multiple if-else statements.

// Things I got stuck on
// -

// Things I can now do
// - Create a switch statement.
// - Create cases for different values.
// - Use break to stop a case.
// - Use default as a fallback.