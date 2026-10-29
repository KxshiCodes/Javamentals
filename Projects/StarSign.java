public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes

        printSquare(4);
        System.out.println("\n---");

        printRectangle(17, 3);
        System.out.println("\n---");

        printTriangle(3);
        System.out.println("\n---");
    }

    // Print row of stars
    public static void printStars(int number) {
        while (number > 0 ){
            System.out.print("*"); // Print n '*'
            number--; //Countdown from n to 0
        }
        System.out.println("");
    }

    // Print Square
    public static void printSquare(int size) {
        int row = 0; // Declare row
        while (row < size){
            printStars(size); // Reuse printStars method
            row++; // Print new row
        }
    }

    // Print Rectangle
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    // Print Triangle
    public static void printTriangle(int size) {
        for (int row = 1; row <= size; row++) {
            printStars(row);
        }
    }
}