package _04_Method_and_Arrays.arrays;

import java.util.Arrays;

public class ArrayPrac {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 1, 4};

        // System.out.println(numbers.length);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

// Things I've discovered
// - An array stores multiple values of the same type.
// - Arrays have a fixed length.
// - length tells me how many elements an array contains.
// - Arrays.sort() sorts the elements of an array.
// - Arrays.toString() can print the contents of an array.

// Things I got stuck on
// -

// Things I can now do
// - Create an array.
// - Store multiple values in an array.
// - Find the length of an array.
// - Sort an array.
// - Print the contents of an array.