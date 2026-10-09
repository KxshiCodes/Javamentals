import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Prompt User for Value of the gift
        System.out.println("Value of the gift? ");
        int gift = Integer.valueOf(scn.nextLine());


        // Tax Calculations
        if (gift > 1_000_000){
            System.out.println("Tax: " + (142_100 + (gift - 1_000_000) * 0.17));
        } else if (gift >= 200_000){
            System.out.println("Tax: " + (22100 + (gift - 200_000) * 0.15));
        } else if (gift >= 55000){
            System.out.println("Tax: " + (4700 + (gift - 55000) * 0.12));
        } else if (gift >= 25000){
            System.out.println("Tax: " + (1700 + (gift - 25000) * 0.10));
        } else if (gift >= 5000){
            System.out.println("Tax: " + (100 + (gift - 5000) * 0.08));
        } else {
            System.out.println("No tax!");
        }
        scn.close();
    }
}

// Mistakes I made when problem solving
/*
- I put the expression operators in the wrong place
- I forgot to add a '=' to the end of the '+' for this program
- I realised i had to minus gift from the lowest range of tax range
- When I felt close to solving my problem I rushed the code I didn't take my time to process why my previous code were wrong.
I just kept trying different solutions without letting it mentally marinate.
*/