
        //  Description : (Sort students) Write a program that prompts the user to enter the number of
        //  students to be processed, the students’ names, and their scores, and prints the student names in
        //    decreasing order of their scores.


 import java.util.*;

 public class Exercise07_17 {
     public static void main(String[] args){
 
         Scanner kb = new Scanner(System.in);        // declaration of variable 
         int num_pairs = 0;                          // number of pairs

 
 
         System.out.print("Enter the number of Students: ");
         num_pairs = kb.nextInt();
         kb.nextLine();              // clears input
 
         String [] names = new String [num_pairs];
         double [] scores = new double [num_pairs];
 
 
         for (int i = 0 ; i < num_pairs; i++){
            System.out.print("Enter student name: ");
            names[i] = kb.nextLine();
            System.out.print("Enter the score : ");
            scores[i] = kb.nextDouble();
            kb.nextLine();                       // fixing skip error bug
        }
        
         
 
         System.out.println("\nThe Scores in descending order are : \n");
         sort_student(names, scores);
 
     }
 
 
     public static void sort_student(String [] names, double[] scores){
 
         int len_scores = scores.length;     // length of the array
         double [] temp_scores = Arrays.copyOf(scores,len_scores); // creating a temp array by copying the original array
         Arrays.sort(temp_scores);   // sorting the temp array in increasing order
 
 
         for (int i = len_scores -1;  i >= 0; i--){         // looping though the sorted array in descending order
             double number = temp_scores[i];                    // the number starting from the end of the array
             for (int f=0; f < scores.length; f++){
                 double loop_count = scores[f];
                 if(number == loop_count){                   // if the last number is equal to the number in the original array of f
                     System.out.println(names[f] + " Scored " + scores[f]); // if it is print it out. This helps with outputting the number in decreasing order
                 }
             }
         }
     }
 }
 