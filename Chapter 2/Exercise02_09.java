/*
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
	divided by the time taken to make the change, as shown in the following formula:
	a = 
	v1 - v0
	----
	t
	Write a program that prompts the user to enter the starting velocity v0 in meters/
	second, the ending velocity v1 in meters/second, and the time span t in seconds,
	and displays the average acceleration.
 */

import java.util.*;

public class Exercise02_09{
	public static void main (String [] args) {
		// Creating a Scanner class
		Scanner kb = new Scanner (System.in);
		
		// asking for user input
		System.out.print("Enter v0, v1, and t: ");
		double v0 = kb.nextDouble();
		double v1 = kb.nextDouble();
		double timeSpan = kb.nextDouble();
		
		double avgAcceleration = (v1 - v0) / timeSpan;
		
		System.out.println("The average acceleration is " + avgAcceleration );
		
		
	}
}
 