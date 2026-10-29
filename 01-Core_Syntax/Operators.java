public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic operators
        System.out.println(a + b); // Addition
        System.out.println(a - b); // Subtraction
        System.out.println(a * b); // Multiplication
        System.out.println(a / b); // Division (whole number result)
        System.out.println(a % b); // Remainder

        // Comparison operators
        System.out.println(a > b);  // Greater than
        System.out.println(a < b);  // Less than
        System.out.println(a == b); // Equal to
        System.out.println(a != b); // Not equal to
        System.out.println(a >= b); // Greater than or equal to
        System.out.println(a <= b); // Less than or equal to

        // Logical operators
        System.out.println(a > 0 && b > 0); // AND
        System.out.println(a > 0 || b < 0); // OR
        System.out.println(!(a > 0));       // NOT
    }
}


