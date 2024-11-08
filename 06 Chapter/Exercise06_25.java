// (Convert milliseconds to hours, minutes, and seconds) Write a method that con-
// verts milliseconds to hours, minutes, and seconds using the following header:
// public static String convertMillis(long millis)




 import java.util.*;

 public class Exercise06_25 {
     
     public static void main(String[] args){
 
         // Declaration of variable
         Scanner kb = new Scanner(System.in);
 
         Long usr_millisec;
 
         System.out.print("Enter the millisecond : ");
         usr_millisec = kb.nextLong();
 
         System.out.println("\nThe the time would be : " + convertMillis(usr_millisec));
 
     
 
     }
 
 
     public static String convertMillis (long millis){
 
         // Storing the variable to local
         Long mill_sec = millis;
 
         // Converting to seconds 
         Long total_second = mill_sec / 1000;
 
         // Converting the seconds to hours
         // 3600 seconds = 1 hour
         int total_hour = total_second.intValue() / 3600;
         String hour_str = Integer.toString(total_hour);
 
         // Calculating the remaining minutes
         // Every 60 minutes = 1 hour
         int total_minutes = (total_second.intValue() % 3600) / 60;
         String minute_str = Integer.toString(total_minutes);
 
         // Calculating the left over seconds 
         // every 60 seconds = 1 minute
         int left_second = (total_second.intValue() % 3600) % 60;
         String second_str = Integer.toString(left_second);
 
 
         // Converting to the string format hours:minutes:seconds
         String formated_str = hour_str + ":" + minute_str + ":" + second_str;
 
         return formated_str;
     
 
     }
 
 }
 