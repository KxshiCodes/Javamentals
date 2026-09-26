package _05_Arrays;

import java.util.Arrays;

public class MultiDimArrays {
    public static void main(String[] args) {
        int [][] numbers = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(numbers));
    }
}

// Things I've discovered
// - Multi-dimensional arrays can store arrays inside an array.
// - A 2D array can be thought of as rows and columns.
// - They can be used for tables, grids, matrices, scientific computation, etc.
// - Arrays.deepToString() can print the contents of a multi-dimensional array.

// Things I got stuck on
// -

// Things I can now do
// - Create a 2D array.
// - Store multiple rows and columns of values.
// - Print a 2D array using Arrays.deepToString().