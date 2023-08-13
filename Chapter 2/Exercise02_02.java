// (Compute the volume of a cylinder) Write a program that reads in the radius
// and length of a cylinder and computes the area and volume using the following
// formulas:
// area = radius * radius * p
// volume = area * length

import java.util.*;

public class Exercise02_02{
    public static void main (String[] args){
        // declaration
        Scanner kb = new Scanner(System.in);
        double radius;
        double area;
        double volume;
        double length;

        System.out.println("Enter the radius and length of a cylinder: ");
        radius = kb.nextDouble();
        length = kb.nextDouble();

        area = radius * radius * Math.PI;
        volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}