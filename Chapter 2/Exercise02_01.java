// (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
// a double value from the console, then converts it to Fahrenheit and displays the
// result. The formula for the conversion is as follows:
// fahrenheit = (9 / 5) * celsius + 32
// Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

import java.util.*;

public class Exercise02_01{
    public static void main (String [] args){

        // Declaration 
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius: ");
        double usr_input = kb.nextDouble();

        double output = 9.0/5 * usr_input + 32;

        System.out.println(usr_input + "  Celsius is " + output + " Fahrenheit");


    }
}