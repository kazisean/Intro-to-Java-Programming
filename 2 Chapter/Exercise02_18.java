/*
 * (Print a table) Write a program that displays the following table. Cast floating-
    point numbers into integers.
    a      b      pow(a, b)
    1      2      1
    2      3      8
    3      4      81 
    4      5      1024
    5      6      15625
 */

public class Exercise02_18{
    public static void main (String[] args){
        float a;
        float b;
        System.out.println("a      b      pow(a, b)");
        a = 1;
        b = 2;
        System.out.println((int)a + "        " + (int)b + "        " + Math.pow(a, b));
        a = 2;
        b = 3;
        System.out.println((int)a + "        " + (int)b + "        " + Math.pow(a, b));
        a = 3;
        b = 4;
        System.out.println((int)a + "        " + (int)b + "        " + Math.pow(a, b));
        a = 4;
        b = 5;
        System.out.println((int)a + "        " + (int)b + "        " + Math.pow(a, b));
        a = 5;
        b = 6;
        System.out.println((int)a + "        " + (int)b + "        " + Math.pow(a, b));
        
    }
}