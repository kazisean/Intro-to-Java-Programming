// (Occurrences of a specified character) Write a method that finds the number of
// occurrences of a specified character in a string using the following header:
// public static int count(String str, char a)


 import java.util.*;

 public class Exercise06_23 {
     
     public static void main(String[] args){
 
         // Declaring variable 
         Scanner kb = new Scanner(System.in);
         String usr_input_str;
         char usr_input_char;
         int char_count = 0;
 
         System.out.print("Enter a String value : ");
         usr_input_str = kb.nextLine();
 
 
         System.out.print("Enter a character to check its occurrence : ");
         usr_input_char = kb.next().charAt(0);
 
 
         // using the count method to check its occurrence
         char_count = count(usr_input_str, usr_input_char);
 
         // output 
         System.out.println("\nThe number of occurrence of the character " + usr_input_char + " in the String " + usr_input_str + " is " + char_count);
 
 
     }
 
 
     public static int count (String str, char a){
 
         // Storing the variables locally
         String usr_string = str;
         char usr_char = a;
         int char_count = 0 ;        // Default set to 0
         String char_str = String.valueOf(usr_char);             // converting char to string for easier processing 
         
         for (int i = 0; i <= usr_string.length() - 1; i++){
             char finder = usr_string.charAt(i);        // iterating though all the character in the string
             String str_finder = String.valueOf(finder);     // converting char back to string so we can use the .equal 
 
             if (str_finder.equals(char_str)){
                 char_count = char_count + 1;
             }
 
         }
 
         return char_count;
 
 
 
     }
 
 
 }
 