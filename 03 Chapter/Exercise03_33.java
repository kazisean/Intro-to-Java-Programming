/* (Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of each package and displays the one with
the better price.
*/

import java.util.*;

public class Exercise03_33 {

    public static void main(String[] args) {

        // Creating a Scanner class
        Scanner kb = new Scanner(System.in);

        // Variables
        double item1weight = 0;
        double item1price = 0;

        double item2weight = 0;
        double item2price = 0;

        System.out.print("Enter weight and price for package 1: ");
        item1weight = kb.nextDouble();
        item1price = kb.nextDouble();

        // clearing buffer
        kb.nextLine();

        System.out.print("Enter weight and price for package 2: ");
        item2weight = kb.nextDouble();
        item2price = kb.nextDouble();

        // calculations 
        double avgItem1 = item1price / item1weight; // Changed calculation order
        double avgItem2 = item2price / item2weight; // Changed calculation order

        if ((avgItem1 - avgItem2) > 0) { // Changed comparison direction
            System.out.println("Package 2 has a better price."); // Changed output message
        } else if (avgItem1 == avgItem2) {
            System.out.println("Two packages have the same price.");
        } else {
            System.out.println("Package 1 has a better price."); // Changed output message
        }
    }
}
