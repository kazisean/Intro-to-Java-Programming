/*
 *  (Financial application: calculate future investment value) Write a program that 
    reads in investment amount, annual interest rate, and number of years, and dis-
    plays the future investment value using the following formula:
    futureInvestmentValue =
    investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
    For example, if you enter amount 1000, annual interest rate 3.25%, and number 
    of years 1, the future investment value is 1032.98.
 */

import java.util.*;

public class Exercise02_21{
    public static void main (String [] args){
        // creating scanner class kb 
        Scanner kb = new Scanner (System.in);

        System.out.print("Enter investment amount: ");
        double usrAmount = kb.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double usrInterest = kb.nextDouble();

        // converting to decimal
        usrInterest = usrInterest / 100;

        System.out.print("Enter number of years: ");
        int usrYear = kb.nextInt();

        double futureInvestmentValue = usrAmount * Math.pow((1 + usrInterest/12), usrYear*12);

        System.out.print("Accumulated value is " + futureInvestmentValue);
    }
}