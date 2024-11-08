// Description : Write a sort method that uses the bubble-sort algorithm to sort numbers in
// ascending order. The bubble-sort algorithm makes several passes through the array. On each
// pass, successive neighboring pairs are compared. If a pair is not in order, its values are swapped;
// otherwise, the values remain unchanged. The technique is called bubble-sort or sinking sort
// because the larger values gradually “bubble” their way to the top and the smaller values “sink” to
// the bottom. Write also a test program that reads in ten numbers, invokes the method, and
// displays the sorted numbers.

 import java.util.*;

 public class Exercise07_18 {
     public static void main (String[] args){
 
         Scanner kb = new Scanner(System.in);
 
         Double [] user_num = new Double [10];
 
         
         for (int i = 0; i < 10; i++){
             System.out.print("Enter ten numbers: ");
             user_num[i]=kb.nextDouble();
         }
 
         bubble_sort(user_num);
 
         System.out.println("\nThe sorted numbers are below : ");
         for(Double i:user_num){
             System.out.println(i);
         }
     }
 
     public static void bubble_sort(Double[] new_array){
 
         int len = new_array.length;         // length of the array
 
         for(int i = 0; i < len - 1; i++){
             for(int d = 0; d < len - i -1; d++){
 
                 if (new_array[d] > new_array [d+1]){            // check if d value of new array is greater than the next value 
                     Double temp = new_array[d];                 // temp variable to store the value so we can place it later
                     new_array[d] = new_array[d + 1];
                     new_array[d + 1] = temp;                    // replace next value with temp
                 }
             }
         }
     }
 
 }
 