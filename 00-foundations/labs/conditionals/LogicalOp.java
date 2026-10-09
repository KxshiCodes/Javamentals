import java.util.Scanner;

public class LogicalOp {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = scn.nextInt();

        if (age > -1 && age <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}

// Things I've discovered
// - Logical operators combine multiple conditions.
// - && means AND: both conditions must be true.
// - || means OR: at least one condition must be true.
// - ! means NOT: it reverses a boolean value.
// - I can combine logical operators to create more complex conditions.

// Things I got stuck on
// -

// Things I can now do
// - Combine multiple conditions using &&.
// - Use || when either condition can be true.
// - Reverse a boolean using !.
// - Create more complex boolean expressions.