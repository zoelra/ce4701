/**
 * FindMin3 takes three input variables and returns which is the minimum value
 *
 * @author Zophia Raleigh
 * @version 9 October 2018
 */
import java.util.Scanner;          

public class FindMin3
{

    public static void main(String[] args)
    {

        System.out.print("Program to compare three numbers ");
        System.out.println(" and output minimum value entered");

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter 1st number: ");
        int number1 = input.nextInt();                       

        System.out.print("Enter 2nd number: ");
        int number2 = input.nextInt();

        System.out.print("Enter 3rd number: ");
        int number3 = input.nextInt();
        
        System.out.printf("The Minimum of (%d, %d, %d) = %d", number1, number2, number3, min3(number1, number2, number3));
    }
    
    public static int min3(int number1, int number2, int number3){
        int minimum =0;
        if (number1 <= number2 && number1 <= number3){
        minimum = number1;
    }
        else if (number2 <= number1 && number2 <= number3){
        minimum = number2;
    }
        else {
        minimum= number3;
    }
    return minimum;
    }
}
