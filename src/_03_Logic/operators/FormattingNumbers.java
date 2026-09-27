package _03_Logic.operators;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {

        // Format as currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1_234_567.891);

        System.out.println(result);

        // Format as a percentage
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);

        System.out.println(result2);

        // Method chaining
        String result3 = NumberFormat.getPercentInstance().format(0.1);

        System.out.println(result3);
    }
}

// Things I've discovered
// - NumberFormat can format numbers in different ways.
// - getCurrencyInstance() formats a number as currency.
// - getPercentInstance() formats a decimal as a percentage.
// - 0.1 becomes 10% when formatted as a percentage.
// - I can chain methods together when one method returns an object
//   that has another method I want to use.

// Things I got stuck on
// -

// Things I can now do
// - Format numbers as currency.
// - Format decimal values as percentages.
// - Use method chaining.