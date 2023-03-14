// Write a test program that reads three sides for a triangle and computes the area if
// the input is valid. Otherwise, it displays that the input is invalid. The formula for
// computing the area of a triangle is given in Programming Exercise 2.19.


import java.util.*;;

 public class Exercise06_019 {
     
     public static void main (String[] args){
 
         // Declaration of variables
         Scanner kb = new Scanner(System.in);
         double input_side_1 = 0; 
         double input_side_2 = 0;
         double input_side_3 = 0;
 
         
         System.out.print("Enter the double value of side 1 : ");
         input_side_1 = kb.nextDouble();
         kb.nextLine();
 
         System.out.print("Enter the double value of side 2 : ");
         input_side_2 = kb.nextDouble();
         kb.nextLine();
 
         System.out.print("Enter the double value of side 3 : ");
         input_side_3 = kb.nextDouble();
 
 
         // validation check using the isValid method
         boolean check_valid = isValid(input_side_1, input_side_2, input_side_3);
 
         if (!check_valid){
 
             System.out.println("\nInvalid input");
         }
         else{
             // variable to use the area method to calculate the area of the triangle
             double triangle_area = area(input_side_1, input_side_2, input_side_3);
             System.out.println("\nThe area of the triangle is : " + triangle_area);
         }
 
     }
 
 
      /** Return true if the sum of any two sides is greater than the third side. */
 
     public static boolean isValid(double side1, double side2, double side3){
 
             // Storing value
             double usr_side_1 = side1;
             double usr_side_2 = side2;
             double usr_side_3 = side3;
 
             if (
                 usr_side_1 + usr_side_2 > usr_side_3 && usr_side_2 + usr_side_3 > usr_side_1 && usr_side_3 + usr_side_1 > usr_side_2
             )
             {
                 return true;
             }
             else{
                 return false;
             }
 
 
      }
 
      /** Return the area of the triangle. */
     public static double area(double side1, double side2, double side3){
 
             // Storing value
             double usr_side_1 = side1;
             double usr_side_2 = side2;
             double usr_side_3 = side3;
         
 
             // using the same formula from HomeWork #2 problem #3 to calculate the area
             double s =  (usr_side_1 + usr_side_2 + usr_side_3) / 2;
             double triangle_area = Math.sqrt(s * (s - usr_side_1) * (s-usr_side_2) * (s-usr_side_3));
 
 
             return triangle_area;
      }
 
 }
 