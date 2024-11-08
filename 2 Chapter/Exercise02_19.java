/*
 * (Geometry: area of a triangle) Write a program that prompts the user to enter 
    three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. 
 */


import java.util.*;

public class Exercise02_19{
    public static void main (String[] args){
        // creating a scanner class
        Scanner kb = new Scanner(System.in);

        // user inputs
        System.out.print("Enter three points for a triangle: ");
        double x1 = kb.nextDouble();
        double y1 = kb.nextDouble();
        double x2 = kb.nextDouble();
        double y2 = kb.nextDouble();
        double x3 = kb.nextDouble();
        double y3 = kb.nextDouble();
        // adding sides
        double side1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
        double side2 = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2, 2));
        double side3 = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1, 2));

        // calculating area
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));


        // output
        System.out.print("The area of the triangle is " + area);
    }
}