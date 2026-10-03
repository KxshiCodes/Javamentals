/*Project – Credit Card Validator

Build a Java program that checks whether a given credit card number is valid.
Your program should ask the user for a credit card number and determine whether it is a valid American Express, MasterCard, or Visa card.

To validate the card number, use Luhn's algorithm:

- Starting from the second-to-last digit, multiply every other digit by 2.
- Add the digits of those products together.
- Add that result to the digits that were not multiplied by 2.
- If the final total is divisible by 10, the number passes the checksum.
- A valid card must also match the following formats:
- American Express: 15 digits, starting with 34 or 37
- MasterCard: 16 digits, starting with 51, 52, 53, 54, or 55
- Visa: 13 or 16 digits, starting with 4
- If the number does not match any of these formats, print INVALID.

Requirements
Your program must:
Ask the user for a credit card number.
Validate the number using Luhn's algorithm.
Check the card's length and starting digits.
Print one of:
AMEX
MASTERCARD
VISA
INVALID*/