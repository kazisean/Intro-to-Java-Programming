        /* (Sum elements column by column) Write a method that returns the sum of all the
        elements in a specified column in a matrix using the following header:
        public static double sumColumn(double[][] m, int columnIndex)
        Write a test program that reads a 3-by-4 matrix and displays the sum of each
        column. Here is a sample run:
        Enter a 3-by-4 matrix row by row:
        1.5 2 3 4
        5.5 6 7 8
        9.5 1 3 1
        Sum of the elements at column 0 is 16.5
        Sum of the elements at column 1 is 9.0
        Sum of the elements at column 2 is 13.0
        Sum of the elements at column 3 is 13.0 */

import java.util.*;

public class Exercise08_01 {
    
    public static void main (String [] args){
        
        Scanner kb = new Scanner (System.in);

        double usrArray [][] = new double [3][4];


        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int i = 0; i < 3; i++){
            
            for (int j = 0; j <4; j++ ){
                usrArray[i][j] = kb.nextDouble();
            }

        }

        kb.close();


        double sum0 = sumColumn(usrArray, 0);
        double sum1 = sumColumn(usrArray, 1);
        double sum2 = sumColumn(usrArray, 2);
        double sum3 = sumColumn(usrArray, 3);

        System.out.println("Sum of the elements at column 0 is " + sum0);
        System.out.println("Sum of the elements at column 1 is " + sum1);
        System.out.println("Sum of the elements at column 2 is " + sum2);
        System.out.println("Sum of the elements at column 3 is " + sum3);
        

    }

    public static double sumColumn(double[][] m, int columnIndex){
        double finalValue = 0;
        
        for (int i = 0; i < m.length; i++){
           finalValue += m[i][columnIndex];
        }

        
        return finalValue;
    }


}
