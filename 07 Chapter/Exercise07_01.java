/*
 *              Description : (Count occurrence of numbers) Write a program that reads the integers between 1
 */

 import java.util.*;

 public class Exercise07_01{
     public static void main(String[] args){
 
         Scanner kb = new Scanner(System.in);                   
         int [] num_array = new int[100];       // storing user input
         int input_count= 0;                    
         
         System.out.print("Enter integers between 1 and 100 (enter 0 to stop): ");
         int input_collect = kb.nextInt(); 
 
         while(input_collect != 0 && input_count < num_array.length){
             num_array[input_count] = input_collect;
             input_count ++;
             input_collect = kb.nextInt();       //clearing
         }
 
         
         display_occurrence(num_array);
         
 
 
 
     }
     
 
     public static int [] sort_num(int [] unsort_array){     // method used to sort arrays into ASCENDING order
         
         int count = 0;          // keep track of valid values
         
 
         for (int i = 0; i < unsort_array.length ; i++){   // find how many valid values
             if (unsort_array [i] != 0){
                 count++;
             }
         }
 
         int [] temp_array = new int [count];            // temporary array created based on valid values
 
         for (int i = 0; i < unsort_array.length ; i++){
             if (unsort_array [i] != 0){
                 temp_array[i] = unsort_array[i];
             }
         }
 
         Arrays.sort(temp_array);        // sort array ascending order
 
         return (temp_array);
 
     }
 
     public static void display_occurrence(int [] occurrence){           // method to print array occurrence 
 
         int [] temp_array = sort_num(occurrence);   // get sorted array
         int n = temp_array.length; // length of original array
 
         for (int i = 0; i < n; i++) {
             if (temp_array[i] != 0) { // check if num is already counted by checking if the value is 0
                 int counter = 0;
                 int num = temp_array[i]; // current number being counted
 
                 for (int j = 0; j < n; j++) {
                     if (temp_array[j] == num) {
                         counter++;
                         temp_array[j] = 0; // mark as counted by setting the value to 0
                     }
                 }
 
                 System.out.println(num + " occurs " + counter + " times");
             }
         }
 
 
     }
 
 
 
 
     
 }