/*
 * (Financial application: calculate interest) If you know the balance and the annual 
    percentage interest rate, you can compute the interest on the next monthly pay-
    ment using the following formula:
    interest = balance * (annualInterestRate/1200)
    Write a program that reads the balance and the annual percentage interest rate and 
    displays the interest for the next month. 
 */

import java.util.*;

public class Exercise02_20{
    public static void main (String [] args){
        // creating a scanner class
        Scanner kb = new Scanner (System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance = kb.nextDouble();
        double interestRate = kb.nextDouble();

        // calculating the interest
        double interest = balance * (interestRate/1200);

        System.out.print("The interest is " + interest);
    }
}