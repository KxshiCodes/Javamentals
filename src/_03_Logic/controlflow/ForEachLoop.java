package _03_Logic.controlflow;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Mango", "Orange"};

        // Regular for loop
        // I can control the index and direction myself.
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // For-each loop
        // Easier when I just want to access every item.
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

// Things I've discovered
// - A for-each loop is useful when I want to go through every item in an array.
// - I don't need to manage an index with a for-each loop.
// - A regular for loop gives me more control over the index and direction.
// - A for-each loop moves forward through the array.

// Things I got stuck on
// - A regular for loop starts at index 0, not fruits.length.

// Things I can now do
// - Iterate through an array using a regular for loop.
// - Iterate through an array using a for-each loop.
// - Use a for-each loop when I don't need the index.