/*
 *      Description : (Population projection) The U.S. Census Bureau projects population based on the
 *      following assumptions:
 * 
 */

 public class Exercise01_11 {
    public static void main (String[] args){
        // total sec
        System.out.println("Population of year 1 would be : " + (312032486 + (((31536000 / 7)- (31536000 / 13)+ (31536000 / 45)) * 1)));
        System.out.println("Population of year 2 would be : " + (312032486 + (((31536000 / 7) - (31536000/13) + (31536000 / 45)) * 2)));
        System.out.println("Population of year 3 would be : " + (312032486 + (((31536000 / 7) - (31536000/13) + (31536000 / 45)) * 3)));
        System.out.println("Population of year 4 would be : " + (312032486 + (((31536000 / 7) - (31536000/13) + (31536000 / 45)) * 4)));
        System.out.println("Population of year 5 would be : " + (312032486 + (((31536000 / 7) - (31536000/13) + (31536000 / 45)) * 5)));
    }
}