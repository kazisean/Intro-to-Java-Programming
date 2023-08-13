// (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it
// to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
// sample run:


import java.util.*;


public class Exercise02_04{

    public static void main (String[] args){
        // declaration
        Scanner kb = new Scanner (System.in);

        double usrPound;
        double kilograms;

        System.out.println("Enter a number in pounds: ");
        usrPound = kb.nextDouble();

        kilograms = usrPound *  0.454;

        System.out.println(usrPound + " pounds is " + kilograms + " kilograms");
    }

}