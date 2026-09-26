package _06_ControlFlow;

public class LogicalOp {
    public static void main(String[] args) {

        // AND operator
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 25;

        System.out.println(isWarm);

        // OR and NOT operators
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible =
                (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligible);
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