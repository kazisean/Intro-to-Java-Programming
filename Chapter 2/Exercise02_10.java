/*
 * (Science: calculating energy) Write a program that calculates the energy needed
	to heat water from an initial temperature to a final temperature. Your program
	should prompt the user to enter the amount of water in kilograms and the initial
	and final temperatures of the water. The formula to compute the energy is
	Q = M * (finalTemperature – initialTemperature) * 4184
	where M is the weight of water in kilograms, temperatures are in degrees Celsius,
	and energy Q is measured in joules.
 */

import java.util.*;

public class Exercise02_10{
	public static void main (String[] args) {
		// Creating a Scanner Class
		Scanner kb = new Scanner (System.in);

		// Asking user for the amount of water in kg
		System.out.print("Enter the amount of water in kilograms : ");
		double usrAmount = kb.nextDouble();
		System.out.println("");

		// Asking user for the initial temp
		System.out.print("Enter the initial temperature: ");
		System.out.println("");
		double initemp = kb.nextDouble();

		// asking user for the final temp
		System.out.print("Enter the final temperature:");
		double finalTemp = kb.nextDouble();
		System.out.println("");

		// Calculating the amount of energy needed
		double energyNeed = (usrAmount * (finalTemp - initemp)) * 4184;

		// Output
		System.out.println("The energy needed is " + energyNeed);

	}
}