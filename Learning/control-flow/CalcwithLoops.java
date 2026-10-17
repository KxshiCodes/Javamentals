import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Create variables
        int numCount = 0;
        int numSum = 0;

        while (true){
            int posNumbers = Integer.valueOf(scn.nextLine()); // Prompt User for input and Hold User input

            if (posNumbers == 0){
                break;
            } 
            
            // Calculate amount of positive numbers inputted
            if (posNumbers > 0){
                numCount++;
                numSum = numSum + posNumbers; 
            }
        }
            
        // Input validation
        if (numCount > 0){
            double average = (double) numSum / numCount; // Average calculation
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

        scn.close();
    }
}