            /* (Sum the major diagonal in a matrix) Write a method that sums all the numbers
            in the major diagonal in an n * n matrix of double values using the following
            header:
            public static double sumMajorDiagonal(double[][] m)
            Write a test program that reads a 4-by-4 matrix and displays the sum of all its
            elements on the major diagonal. Here is a sample run:
            Enter a 4-by-4 matrix row by row:
            1 2 3 4.0
            5 6.5 7 8
            9 10 11 12
            13 14 15 16
            Sum of the elements in the major diagonal is 34.5
            */

import java.util.*;

public class Exercise08_02 {
    
    public static void main (String [] args){
        Scanner kb = new Scanner(System.in);

        double [][] usrArray = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int i = 0; i <usrArray.length;i++){
            for (int j = 0; j < usrArray[i].length; j++){
                usrArray[i][j]=kb.nextDouble();
            }
        }

        double total = sumMajorDiagonal(usrArray);
        System.out.println("Sum of the elements in the major diagonal is " + total);
        
        
    }

    public static double sumMajorDiagonal(double[][] m){

        double finalValue = 0;

        finalValue += m[0][0];
        finalValue += m[1][1];
        finalValue += m[2][2];
        finalValue += m[3][3];

        return finalValue;
    }




}
