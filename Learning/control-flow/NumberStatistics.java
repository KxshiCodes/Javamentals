import java.util.Scanner;

public class NumberStatistics {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numCounter = 0;
        int even = 0;
        int odd = 0;
    
        while (true){
            int num = Integer.valueOf(scn.nextLine()); // 1. Read
            
            // Stop if the user enters -1
            if (num == -1){
                System.out.println("Thx! Bye!");
                break;
            }

            // Count and add the number
            sum += num; // Sum of numbers
            numCounter++; // Amount of numbers entered

            // Check if even or odd
            if (num % 2 == 0){
                even++;
            } else{
                odd++;
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("Numbers: " + numCounter);

        if (numCounter > 0){
            System.out.println("Average: " + (double) sum / numCounter);
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scn.close();
    }
}