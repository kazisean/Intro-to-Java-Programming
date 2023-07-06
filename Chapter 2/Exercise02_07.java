/*
 * 
 * (Find the number of years) Write a program that prompts the user to enter the
 * 
 * minutes (e.g., 1 billion), and displays the number of years and days for the
 * minutes. For simplicity, assume a year has 365 days.
 * 
 */

import java.util.*;

public class Exercise02_07 {
    public static void main(String [] args) {

	// declaration 
	Scanner kb = new Scanner (System.in);

	// user inputs
	int usrNum;

	// asking user for the number 
	System.out.print("Enter the number of minutes: ");
	usrNum = kb.nextInt();
	
	
	double totalHours = usrNum / 60.0;
	double totalDays = totalHours / 24.0;
	double totalYears = totalDays / 365.0;
	double finalDays = totalDays - (int)totalYears * 365;

	System.out.println(usrNum + " minutes is approximately " + (int)totalYears + " years and " + (int)finalDays + " days");


	
    }
}
