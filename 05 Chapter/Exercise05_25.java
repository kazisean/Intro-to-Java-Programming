// (Compute p) You can approximate p by using the following series

public class Exercise05_25{


    public static void main (String[] args){


        
        // loop that counts from 10 thousand to 100 thousand increasing each by 10 thousand
        for(double i=10000.0; i <= 100000.0; i +=10000.0){

            // since pi returns a fractional value we need to use doubles
            double result_value;

            // Sending the value to I to the FractionCal method to calculate its pi value
            result_value= piCal(i);


            // outputing the pi value of each number of i
            System.out.println("\nThe pi value of " + i + " is approximately: " + result_value);
            
        }

    }


    public static double piCal(double num){

        // Approximating pi using the formula π = 4 (1 −  (1 / 3)  +  (1 / 5)  −  (1 / 7)  +⋯ etc.

        double inside_fraction = 0.0;        // this will be used to calculate the fractions inside of the funtion and storing the value
        double start_denom = 1.0;             // the first denominator of the formula


        for(double i=1.0; i<=num; i ++){

            if(i % 2.0 == 0.0){       // if the number i is even do the following

                inside_fraction -= 1.0/start_denom;   // the numerator is always 1 according to the formula 
                start_denom += 2.0;                    // increasing the denom by 2 every time as the formula

            }
            else{   // if the number i is odd

                inside_fraction += 1.0/start_denom;
                start_denom += 2.0;
               

            }


        }
        
        

        double pi = 4*inside_fraction; // pi calculated output
        return pi;

    }






}