// mario this from C to Java, using the same logic and structure as the original C code.

public static void mario(int height);

public static void main(String[] args) {
    // Prompt user for pyramid height(int)
    // Used 'do while' loop to continuosly the prompt user until input validation is satisfied.
    int height;
    do
    {
        height = get_int("Enter height of pyramid: ");
    }
    while (height < 1 || height > 8);

    // Function call
    print_pyramid(height);
}

// Function definition
void print_pyramid(int height)
{
    // 'Nested for loop' used to print spaces next to bricks shifting it to a right- aligned brick wall.
    for (int row = 0; row < height; row++)
    {
        // Print spaces
        for (int spaces = 0; spaces < height - row - 1; spaces++)
        {
            printf(" ");
        }

        // Print bricks
        for (int column = 0; column <= row; column++)
        {
            printf("#");
        }
        // Skip to new line
        printf("\n");
    }
}