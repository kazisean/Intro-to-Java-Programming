/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
    .java, to fix the possible loss of accuracy when converting a double value to an 
    int value. Enter the input as an integer whose last two digits represent the cents. 
    For example, the input 1156 represents 11 dollars and 56 cents.
 */

import java.util.*;

public class Exercise02_22 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter an amount in int, for example 1156: ");
        int usrInput = kb.nextInt();

        int dollar = usrInput / 100; // Integer division to get the dollar amount
        int cents = usrInput % 100; // Remainder to get the cents amount

        System.out.print("Your amount " + usrInput + " consists of " + dollar + " and " + cents + " cents ");
    }
}