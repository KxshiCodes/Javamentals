import java.util.Scanner;

public class CalcNum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int fNum = Integer.valueOf(scn.nextLine());

        System.out.println("Give the second number: ");
        int sNum = Integer.valueOf(scn.nextLine());

        int result1 = fNum + sNum; 
        int result2 = fNum - sNum;
        int result3 = fNum * sNum;
        double result4 =  (double) fNum / sNum;


        System.out.println(fNum + " + " + sNum + " = " + result1);
        System.out.println(fNum + " - " + sNum + " = " + result2);
        System.out.println(fNum + " * " + sNum + " = " + result3);
        System.out.println(fNum + " / " + sNum + " = " + result4);

        scn.close();
    }
}

// Things I've discovered
/*
- Arithmetic expressions are used to perform calculations.
- + adds two values.
- - subtracts one value from another.
- * multiplies two values.
- / divides one value by another.
- % gives me the remainder after division.
*/ 

// Things I got stuck on


// Things I can now do
/*
- Add, subtract, multiply, and divide values.
- Find the remainder using %.
*/