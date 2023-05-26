// (Convert feet into meters) Write a program that reads a number in feet, converts it
// to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:

import java.util.*;

public class Exercise02_03{
    public static void main (String[] args){
        // scanner declaration 
        Scanner kb = new Scanner (System.in);

        double usrInput; 
        double meter;
        
        System.out.println("Enter a value for feet: ");
        usrInput = kb.nextDouble();

        meter = usrInput * 0.305;

        System.out.println(usrInput + " feet is " + meter + " meters");


    }
}