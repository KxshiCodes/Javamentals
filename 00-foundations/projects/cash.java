// Convert this from C to Java, using the same logic and structure as the original C code.

import java.util.Scanner;
public class Cash {
#include <cs50.h>
#include <stdio.h>

// Function Prototypes
int calculate_quarters(int cents);
int calculate_dimes(int cents);
int calculate_nickels(int cents);
int calculate_pennies(int cents);
void cash_calc(int cents);

int main(void)
{
    // Prompt the user for change owed, in cents(int)
    int cents;
    do
    {
        cents = get_int("Change owed: ");
    }
    while (cents < 0);

    // Function call
    cash_calc(cents);
}

// Function definition
void cash_calc(int cents)
{
    // Calculate quarters, subtract the value of those quarters from cents.
    int quarters = calculate_quarters(cents);
    cents = cents - (quarters * 25);

    // Calculate dimes, subtract the value of those dimes from cents.
    int dimes = calculate_dimes(cents);
    cents = cents - (dimes * 10);

    // Calculate nickels, subtract the value of those nickels from cents.
    int nickels = calculate_nickels(cents);
    cents = cents - (nickels * 5);

    // Calculate pennies, subtract the value of those pennies from cents.
    int pennies = calculate_pennies(cents);
    cents = cents - (pennies * 1);

    // Sum the number of quarters, dimes, nickels, and pennies used.
    int coins = quarters + dimes + nickels + pennies;

    // Print that sum.
    printf("%i\n", coins);
}

// Function definition - Integer division solution
// Let C work for you instead of manually performing division the complicated way.
int calculate_quarters(int cents)
{
    return cents / 25;
}

int calculate_dimes(int cents)
{
    return cents / 10;
}

int calculate_nickels(int cents)
{
    return cents / 5;
}

int calculate_pennies(int cents)
{
    return cents / 1;
}