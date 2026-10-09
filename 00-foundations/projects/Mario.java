import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int height;

        do
        {
            System.out.print("Height: "); // Prompt user for pyramid height(int)until input validation is satisfied.
            height = scn.nextInt();
        } while (height < 1 || height > 8);

        printPyramid(height); // Function call
        scn.close();
}

public static void printPyramid(int height) // Function definition
{
    for (int row = 0; row < height; row++)
    {
        // Print spaces on the left side of the pyramid
        for (int spaces = 0; spaces < height - row - 1; spaces++) {
            System.out.print(" ");
        }

        // Print left bricks
        for (int column = 0; column <= row; column++) {
            System.out.print("#");
        }

        // Print gap between left and right bricks
        System.out.print("  ");

        // Print right bricks
        for (int column = 0; column <= row; column++) {
            System.out.print("#");
        }

        System.out.println(); // New line
    }
}
}