/*
        (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
                                                2 * 2 system of linear equation:
		                                        ax + by = e   x = 	ed - bf	  y = af - ec
		                                        cx + dy = f       	ad - bc       ad - bc
                                                Write a program that solves the following equation and displays the value for x and y:
				                            	3.4x + 50.2y = 44.5
					                            2.1x + .55y = 5.9
*/


/*
 * a = 3.4
 * b = 50.2
 * c = 2.1
 * d = 0.55
 * e = 44.5
 * f = 5.9
 */

public class Exercise01_13 {
    public static void main (String[] args){
        System.out.println("The x value of the equation is : " +  ((( 44.5 * 0.55 ) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)))
        );
        System.out.println("The y value of the equation is : " +  ((( 3.4 * 5.9 ) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)))
        );
    }
}