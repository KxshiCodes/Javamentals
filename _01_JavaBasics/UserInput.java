// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        
        // Tool to read user input
        Scanner scn = new Scanner(System.in);

        // Prompt User main characters name
        System.out.println("I will tell you a story, but I need some information first. \nWhat is the main character called? ");
    
        // Read the string written by the user
        String name = scn.nextLine();

        // Prompt User for Job
        System.out.println("What is their job? ");
        String jobTitle = scn.nextLine();

        // Print out Story using Concatenation
        System.out.println("Here is the story: \nOnce upon a time there was " + name + ", who was " + jobTitle + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + jobTitle + " forever.");

        

    }
}
