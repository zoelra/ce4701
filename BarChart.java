
/**
 * BarChart class takes 5 inputs and creates a simple bar chart out of asterisk characters
 *
 * @author Zophia Raleigh
 * @version 14 November 2018
 * 
 * Please enter number of asterisks [1 to 40]: 1
 * Please enter number of asterisks [1 to 40]: 22
 * Please enter number of asterisks [1 to 40]: 33
 * Please enter number of asterisks [1 to 40]: 44
 * You entered an Invalid number 44, please reenter [1 to 40]: 70
 * You entered an Invalid number 70, please reenter [1 to 40]: 4
 * Please enter number of asterisks [1 to 40]: 5
 */
import java.util.Scanner;
public class BarChart
{
    /**
     * Declare the variables that will be asked for and used in this program
     */

    public static void main(String[] args)
    {
        int number1 = numberAsterisks();
        int number2 = numberAsterisks();
        int number3 = numberAsterisks();
        int number4 = numberAsterisks();
        int number5 = numberAsterisks();

        printBar(number1);
        printBar(number2);
        printBar(number3);
        printBar(number4);
        printBar(number5);

    }

    /**
     * Print the number of asterisks associated with a number
     */
    public static void printBar(int numberAsterisks)
    {

        int i = 1;
        while(i <= numberAsterisks)
        {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    /**
     * Ask for user input
     * Check that the number is in the proper range
     * Request a new number if it is not
     */
    public static int numberAsterisks()
    {
        final int upperLimit = 40;
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter number of asterisks [1 to %d]: ", upperLimit);
        int number = keyboard.nextInt();

        while (number < 1 || number > upperLimit)
        {
            System.out.printf("You entered an Invalid number %d, please reenter [1 to %d]: ", number, upperLimit);
            number = keyboard.nextInt();
        }
        return number;
    }

}
