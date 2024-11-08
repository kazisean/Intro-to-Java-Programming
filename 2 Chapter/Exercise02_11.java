/*
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user 
    to enter the number of years and displays the population after the number of years. 
    Use the hint in Programming Exercise 1.11 for this program. The population 
    should be cast into an integer.
 */

import java.util.*;

public class Exercise02_11{
    public static void main (String [] args){
        // creating kb scanner class
        Scanner kb = new Scanner (System.in);

        // user input 
        System.out.print("Enter the number of years: ");
        int usrInput = kb.nextInt();

         // population data from Exercise 1.11
         double population = (312032486 + (((31536000 / 7)- (31536000 / 13)+ (31536000 / 45)) * usrInput));

         // output 
         System.out.println((int)population);
 
        

    }
} 