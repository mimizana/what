
import java.util.Scanner;

public class What {

    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        double sum = num1+ num2;
        double product = num1 *num2;
        double av = num1 * num2/2;
        if ( sum >=200){
            System.out.println("Sum of the numbers : " +sum +"*,"+ "product :" + product+ " average: "+ av );

        }
        if (sum>=1000){
            System.out.println("Sum of the numbers : " +sum +" ~," +"product :" + product+ " average: "+ av );
        }
        else {
            System.out.println("Sum of the numbers : " +sum + "product :" + product+ " average: "+ av );
        }
    }

}
//Start with the code below and create a program that will output the sum,
// product, and average of num1 and num2.
// If the calculated sum is over 200, print an asterisk next to the sum.