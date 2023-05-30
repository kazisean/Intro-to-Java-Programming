/* 

(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.


*/

import java.util.*;

public class Exercise02_06 {
    public static void main(String[] args) {
        // declaration
        Scanner kb = new Scanner(System.in);
        int finalOutput = 0;
        System.out.println("Enter a number between 0 and 1000: ");
        int usrInput = kb.nextInt();

        if (usrInput > 1000) {
            System.out.println("Invalid");
        }

        else {
            while (usrInput > 10) {
                int aa = usrInput % 10;
                finalOutput += aa;
                usrInput = usrInput / 10;
            }
            if (usrInput < 10) {
                finalOutput += usrInput;
            }
        }
        System.out.println("The sum of the digits is : " + finalOutput);
    }
}