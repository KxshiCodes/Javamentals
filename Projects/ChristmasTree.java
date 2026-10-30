public class ChristmasTree {

    public static void printStars(int number) {
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println();

    }

    public static void printSpaces(int number) {
        for (int spaces = 0; spaces < number; spaces++){
            System.out.print(" ");
        }
        
    }

    public static void printTriangle(int size) {
        for (int row = 1; row <= size; row++){
            printSpaces(size - row);
            printStars(row);
        }
    }

    public static void christmasTree(int height) {
        for (int row = 1; row <= height; row++) {
            printSpaces(height - row);
            printStars(2 * row - 1);

        }

        for (int row = 1; row <= 2; row++) {
            printSpaces(height - 2);
            printStars(3);

        }
    }

    public static void main(String[] args) {

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
