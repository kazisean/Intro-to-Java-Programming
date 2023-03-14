/*
 *          Description :(Print distinct numbers) Write a program that reads in ten numbers and
            displays the number of distinct numbers and the distinct numbers separated by one space (i.e. if a
            number appears multiple times, it is displayed only once). (Hint: Read a number and store it to
            an array if it is new. If the number is already in the array, ignore it.) After the input, the array
            contains the distinct numbers. Here is an example run of the program:
            Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
            The number of distinct numbers is 6
            The distinct numbers are: 1 2 3 6 4 5
 * 
 */


 import java.util.*;

 public class Exercise07_05 {
     public static void main(String[]args){
 
         Scanner kb = new Scanner(System.in);
 
         int [] user_num = new int [10];
 
         System.out.print("Enter ten numbers: ");
         for (int i = 0; i < 10; i++){
             user_num[i]=kb.nextInt();
         }
 
         distinct(user_num);
     }
 
     public static void distinct(int [] num_array){
         int [] temp_array = Arrays.copyOf(num_array,10);        // copy the original array to temp array
         int count = 0;  // storing amount of distinct numbers
 
         String unique_values = " ";         // storing distinct numbers
 
         
         int len = temp_array.length;
 
         for (int i = 0; i < len; i++) {
             boolean distinct = true;
             for (int d = 0; d < i; d++) { // check pervious values
                 if (temp_array[i] == temp_array[d]) {               // if duplicate found
                     distinct = false;                               // false distinct
                     break;                                           // exit
                 }
             }
             if (distinct) { // if distinct true
                 count++; // increase count
                 unique_values = unique_values + temp_array[i];      // add the distinct number into an empty string (used for output)
                 unique_values = unique_values + " ";
             }
         }
 
     
 
         System.out.println("\nThe number of distinct numbers is " + count);
         System.out.println("The distinct numbers are:" + unique_values);
         
 
 
 
     }
 
 
 }
 
 
 
 
 