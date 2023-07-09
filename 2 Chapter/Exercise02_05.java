// (Financial application: calculate tips) Write a program that reads the subtotal
// and the gratuity rate, then computes the gratuity and total. For example, if the
// user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
// as gratuity and $11.5 as total. Here is a sample run:


import java.util.*;

public class Exercise02_05 {
    public static void main (String [] args){
        //declaration
        Scanner kb = new Scanner (System.in);

        double subTotal;
        double gratuity;
        double extraTotal;

        System.out.println("Enter the subtotal and a gratuity rate: ");
        subTotal = kb.nextDouble();
        gratuity = kb.nextDouble();

        gratuity = gratuity * 0.01;

        extraTotal = subTotal * gratuity;

        System.out.println("The gratuity is $" + extraTotal + " and total is $" + (subTotal+extraTotal) );
        


    }
}