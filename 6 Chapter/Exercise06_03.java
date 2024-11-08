// (Palindrome integer) A number is a palindrome if its reversal is the same as
// itself. Write a program that prompts the user to enter an integer and reports whether the integer is
// a palindrome. The program should use the reverse and isPalindrome methods with the headers:


 import java.util.*;

 public class Exercise06_03{
     public static void main(String[] args){
 
         // Declaring variables
         Scanner kb = new Scanner(System.in);
         int usr_input = 0;      //default value
         String str_usr_input = ""; // used to store usr input as string
         boolean valid_check = false; // input validation switch
 
         
         // input validation
         while (!valid_check){
 
             System.out.print("Enter an integer value : ");
 
                 if(kb.hasNextInt()){
                     String str_input= kb.nextLine();
                     str_usr_input += str_usr_input + str_input;
                     int temp_input = Integer.parseInt(str_input);
                     if (temp_input > 0){
                         usr_input += temp_input;
                         valid_check = true;
                     }
                     else{
                         System.out.println();
                         System.out.println("Invalid Input. Please try again");
                         System.out.println();
                     }
                 }
 
                 else{
                     System.out.println();
                     System.out.println("Invalid Input. Please try again");
                     System.out.println();
                     kb.nextLine(); //fixes skipping bug
                 }
         }
 
         boolean palindrome_check = isPalindrome(usr_input);
 
         if (palindrome_check == false){
             System.out.println();
             System.out.println(usr_input + " is not a palindrome");
         }
         else{
             System.out.println();
             System.out.println(usr_input + " is a palindrome");
         }
 
         // Warning message if leading integer is a zero
         
         if (Character.toString(str_usr_input.charAt(0)).equals("0")) {
             System.out.println();
             System.out.println("Please note that you have entered a number which has a leading integer value of 0. In this java program leading integer will be replaced with a empty space. For example : if you have entered the number 0202 the program will recognize the input as 202.");
         }
         else{
             System.out.println();
         }
 
 
 
 
 
     }
 
 
 
     //the method returns the reversal of an integer, i.e, reverse(456) should return 654
     public static int reverse (int number){
         String temp_num = Integer.toString(number); // converting number to string to reverse it
         String reversed = "";
         int index_last = temp_num.length() - 1; // last number of the string
         
         // for loop to reverse the string
         for (int i =index_last; i >= 0; i--){
 
 
             reversed = reversed + temp_num.charAt(i);
 
         }
 
         int return_value = Integer.parseInt(reversed); // converting the final output back to int
 
         return return_value;
 
 
     }
 
 
     //the method returns true if the reverse number and the input number is the same
     public static boolean isPalindrome (int number) {
 
         String original_num = Integer.toString(number);
         int reversed_num = reverse(number);
         String final_num = Integer.toString(reversed_num);
 
         return original_num.equals(final_num);
         
 
     }
 
 
 
 
 }