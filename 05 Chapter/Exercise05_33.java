// (Perfect number) A positive integer is called a perfect number if it is equal to
// the sum of all of its positive divisors, excluding itself. For example, 6 is the first
// perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
// + 1. There are four perfect numbers less than 10,000. Write a program to find all
// these four numbers.


public class Exercise05_33{

    public static void main (String[] args){

        // Program welcome message
        System.out.println("The four perfect numbers less than 10,000 are : ");


        // looping all the numbers from 1 to 10000
        for (int i = 1; i < 10000+1; i++){

            // variable that will be used to check if the factors all add up to itself
            int checkItself = 0;

            // statement to count all the numbers from 1 to i
            for(int z = 1; z < i; z++){

                // statement check if i number can be evenly divisible by z
                if (i % z == 0){

                    // if so we add it to the checkItself variable
                    checkItself = checkItself + z;
                }

            } 
            
            // if the checkItself number is equal to i then we output it 
            if (checkItself == i){
                // output the number
                System.out.println(checkItself);
            }

        }
        



    }
}
