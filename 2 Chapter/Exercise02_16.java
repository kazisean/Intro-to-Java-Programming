/*
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the 
    side of a hexagon and displays its area. 
 */

import java.util.*;


public class Exercise02_16{
    public static void main (String[] args){
        // creating a scanner class kb
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double usrSide = kb.nextDouble();

        // calculating area
        double area = (3 * Math.sqrt(3))/2 * Math.pow(usrSide, 2);

        System.out.print("The area of the hexagon is " + area);
    }
}