/*
 *   (Cost of driving) Write a program that prompts the user to enter the distance to 
 *   drive, the fuel efficiency of the car in miles per gallon, and the price per gallon, 
 *   and displays the cost of the trip. 
 */

import java.util.*; 

public class Exercise02_23{
    public static void main (String [] args){
        // creating scanner class kb
        Scanner kb = new Scanner (System.in);

        System.out.print("Enter the driving distance: ");
        double distance = kb.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double mPerMile = kb.nextDouble();

        System.out.print("Enter price per gallon: ");
        double moneyPerGallon = kb.nextDouble();

        System.out.print("The cost of driving is " + ((distance/mPerMile)*moneyPerGallon) );
    }
}