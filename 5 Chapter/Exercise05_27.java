// (Display leap years) Write a program that displays all the leap years, ten per line,
// from 101 to 2100, separated by exactly one space. Also display the number of
// leap years in this period.

public class Exercise05_27 {
    public static void main(String[]args){

        //variable to keep track of the number of leap years found
         int Leapcount = 0;

        // Variable to help only print 10 years per line for better looking ui
        int timesCount = 0;


        // Program welcome message 
        System.out.println("All the leap years from 101 to 2100 are : ");

        // For loop going from 101 to 2100
        for(int i=101; i<2100 + 1; i++){

            // the leap year formula in if statement, where if true the statement runs or else it moves on
            // checks if the number is evenly divisible by 4 and not evenly divisible by 100 or if the number is evenly divisible by 400
            if (i%4==0 && i%100 != 0 || i % 400 ==0){
                
                // updating the amount of leap year count by adding 1 more
                Leapcount += 1;
                timesCount +=1;

                // Outputing the leap year
                System.out.print(i + " ");
                
                // if the timesCount becomes 10 then we create a new line for better design  & reset the value of timeCount back to 0
                if(timesCount == 10){
                    System.out.println();
                    timesCount -= 10;
                }


            }

        }

        // Outputing the amount of leap years found from 101 to 2100
        System.out.println();
        System.out.println("\nThere are "+Leapcount + " leap years from 101 to 2100.");

     }
    
}  

