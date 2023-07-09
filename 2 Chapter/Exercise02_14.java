/*
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of 
    health on weight. It can be calculated by taking your weight in kilograms and 
    dividing by the square of your height in meters. Write a program that prompts the 
    user to enter a weight in pounds and height in inches and displays the BMI. Note 
    that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */

import java.util.*;

public class Exercise02_14{
    public static void main (String [] args){
        // creating a scanner class kb 
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double poundWeight = kb.nextDouble();
        double weight = poundWeight * 0.45359237;
        
        
        System.out.print("Enter height in inches: ");
        double inchHeight = kb.nextDouble();
        double height = inchHeight * 0.0254;

        double usrBmi = weight/Math.pow(height, 2);


        System.out.print("BMI is " + usrBmi);

    }
}