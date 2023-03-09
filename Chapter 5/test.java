import java.util.Scanner;

public class test{

    public static void main(String[] args){
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        Scanner kb = new Scanner(System.in);
        System.out.print(
            "What is " + num1 + " + " + num2 + " : " 
        );
        int usr_input = kb.nextInt();

        while(num1 + num2 !=usr_input){
            System.out.println("Sorry Wrong Answer :c Try again !!");
            System.out.print(
                "What is " + num1 + " + " + num2 + " : " 
            );
            usr_input = kb.nextInt();
        }

        System.out.println("Nice You got It Wooo !!!");






    }

}