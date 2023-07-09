/*
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off 
 *  speed v, you can compute the minimum runway length needed for an airplane to 
 *   take off using the following formula:
 *                    v2
 *          length = ----
 *                    2a
 *  Write a program that prompts the user to enter v in meters/second (m/s) and the 
 *  acceleration a in meters/second squared (m/s2), and displays the minimum run-
 *  way length.
 * 
 */

 import java.util.Scanner;

 public class Exercise02_12{
     public static void main (String [] args){
 
         // creating a scanner class kb
         Scanner kb = new Scanner(System.in);
 
         System.out.print("Enter speed and acceleration: ");
         int speed = kb.nextInt();
         double acceleration = kb.nextDouble();
 
         double minLength = (speed * speed) / (2 * acceleration);
 
         System.out.println("The minimum runway length for this airplane is " + minLength);

 
     }
 }