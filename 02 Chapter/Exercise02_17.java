/*
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone 
is not enough to provide the answer. Other factors including wind speed, rela-
tive humidity, and sunshine play important roles in determining coldness outside. 
In 2001, the National Weather Service (NWS) implemented the new wind-chill 
temperature to measure the coldness using temperature and wind speed. The 
formula is
twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16
where ta is the outside temperature measured in degrees Fahrenheit and v is the 
speed measured in miles per hour. twc is the wind-chill temperature. The formula 
cannot be used for wind speeds below 2 mph or temperatures below -58ºF or 
above 41ºF.
Write a program that prompts the user to enter a temperature between -58ºF and 
41ºF and a wind speed greater than or equal to 2 and displays the wind-chill tem-
perature. Use Math.pow(a, b) to compute v0.16. 
 */

import java.util.*;

public class Exercise02_17{
    public static void main (String [] args){
        // creating a scanner class kb 
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double usrTemp = kb.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = kb.nextDouble();

        if (usrTemp >= -58 && usrTemp <= 41 && windSpeed >=2){

            double windChill = 35.74 + (0.6215 * usrTemp) - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * usrTemp * Math.pow(windSpeed, 0.16);
            
            System.out.print("The wind chill index is " + windChill);


        }
        else {
            System.out.println("Invalid input");
        }



    }
}