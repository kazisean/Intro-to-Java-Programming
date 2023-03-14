// (Decimal to binary) Write a program that prompts the user to enter a decimal
// integer and displays its corresponding binary value. Don’t use Java’s Integer
// toBinaryString(int) in this program.


 import java.util.*;

 public class Exercise05_37{
     public static void main(String[] args){
         // Declaration of varibles
         Scanner kb = new Scanner(System.in);    //creating a new scanner class kb
         int user_input = 0;       // variable for user input store after passed input validation
         int remainder;  // used when calculating the remainder
         int tempStoreIn, originalInput; // used to hold the original user input
         boolean ValidCheck = false;       // will be used for input validation
         String binary = "";     // This will be used to store the binary output
         
 
         // Input validation check
 
         while(!ValidCheck){
             System.out.print("Please enter a decimal integer : ");
 
             if (kb.hasNextInt()){    // checks if the input is an int
                 originalInput = kb.nextInt();
                 if (originalInput >= 0){
                     ValidCheck = true;  // Switches the valid check true if the input is an int and greater than or equal to 0 to exit the loop
                      user_input = originalInput;
 
                 }
                 else{   // invalid input showcasing error message
                     ValidCheck = false;
                     System.out.print("\nInvalid Input. Please try again!");
                     System.out.println();
                 }
 
             }
             else{       // invalid input showcasing error message
                 
                 System.out.print("\nInvalid Input. Please try again!");
                 System.out.println();
                 kb.next();      // fixes auto skipping without promting again
             }
         }
 
          // Assign the input number to the variable a temp variable
         tempStoreIn = user_input;
 
 
          // outputs if user input 0
          if (tempStoreIn == 0){
             System.out.println("The binary value of that would be : 0");
         }
 
         while(user_input !=0){        // if the user input is not equal to 0 runs the loop 
             remainder = user_input % 2;  // get the remainder 
             binary = remainder + binary; // add the remainder to the binary string
             user_input = user_input / 2;        // divide to decrease the number
              
         }
 
       
 
         // Output if user input was not 0
         if (tempStoreIn !=0){
 
             System.out.println("The binary value of that would be : " + binary);
 
         }
 
     }
 }
 
 
 