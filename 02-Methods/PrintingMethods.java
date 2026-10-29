public class PrintingMethods {

    public static void main(String[] args) {

        printStars(3);
        System.out.println("---");

        printSquare(4);
        System.out.println("---");

        printRectangle(17, 3);
        System.out.println("---");

        printTriangle(3);
    }

    // Print a row of stars
    public static void printStars(int number) {
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println();
    }

    // Print a square
    public static void printSquare(int size) {
        for (int row = 0; row < size; row++) {
            printStars(size);
        }
    }

    // Print a rectangle
    public static void printRectangle(int width, int height) {
        for (int row = 0; row < height; row++) {
            printStars(width);
        }
    }

    // Print a triangle
    public static void printTriangle(int size) {
        for (int row = 1; row <= size; row++) {
            printStars(row);
        }
    }
}
