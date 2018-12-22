/**
 * ExploreArrays holds a set of data value and calculates the sum and average. It also determines the min, max, and range of a set of data values, and has a fill method.
 * Main purpose is to demonstrate arrays.
 *
 * @author1 Zophia Raleigh
 * @author2 Ny Nguyen
 * @version 29 November 2018
 * 
 * Example Output:
 * 
 * Exploring arrays
 *The array with 4 elements [3.2, 5.4, 7.6, 1.8]
 *The sum of the array elements [3.2, 5.4, 7.6, 1.8] is 18.00
 *The sum of the array elements [3.2, 5.4, 7.6, 1.8] is 18.00
 *The mean of [3.2, 5.4, 7.6, 1.8] is 4.50
 *How many numbers: 3
 *Enter lower and upper range limits: 1
 *5
 *
 *Enter a number: 2
 *
 *Enter a number: 4
 *
 *Enter a number: 3
 *The sum of the array elements [2.0, 4.0, 3.0] is 9.00
 *The mean of the array elements [2.0, 4.0, 3.0] is 3.00
 *The minimum of [3.2, 5.4, 7.6, 1.8] is 1.80
 *The maximum of [3.2, 5.4, 7.6, 1.8] is 7.60
 *The range of [3.2, 5.4, 7.6, 1.8] is 5.80
 *After fill with 2.5, the array is [2.5, 2.5, 2.5, 2.5, 2.5, 2.5]
 *
 */
import java.util.Scanner;

public class ExploreArrays
{
    /**
     * Test the array methods
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Exploring arrays");

        double[] arr1 = {3.2, 5.4, 7.6, 1.8};
        String str = toString( arr1 );
        System.out.println( "The array with 4 elements " + str );

        System.out.printf("The sum of the array elements %s is %.2f\n", toString(arr1), calcSum(arr1));

        double sum = 0.0;
        for(int i = 0; i < arr1.length; i++)
        {
            sum = arr1[i] + sum;
        }
        System.out.printf("The sum of the array elements %s is %.2f\n", str, sum);

        System.out.printf("The mean of %s is %.2f\n", toString(arr1), calcMean(arr1));

        double[] madeArr = makeArray ();

        System.out.printf("The sum of the array elements %s is %.2f\n", toString(madeArr), calcSum(madeArr));
        System.out.printf( "The mean of the array elements %s is %.2f\n", toString(madeArr), calcMean(madeArr));

        System.out.printf("The minimum of %s is %.2f\n", toString(arr1), findMin(arr1));
        System.out.printf("The maximum of %s is %.2f\n", toString(arr1), findMax(arr1));
        System.out.printf("The range of %s is %.2f\n", toString(arr1), calcRange(arr1));

        double[] testArr = new double[6];
        fill(testArr, 2.5);
        System.out.printf("After fill with 2.5, the array is %s\n", toString(testArr));

    }

    /*****    Add the methods calcSum, calcMean, etc here ******/   

    /**
     * Calculate the sum of the elements of a double array
     * @param array   the array 
     * @return the sum value of the array elements
     */
    public static double calcSum( double[ ] array )
    {
        double sum = 0.0;
        for(int i = 0; i < array.length; i++)
        {
            sum = array[i] + sum;
        }

        return sum;
    }    

    /**
     * Calculate the mean of the elements of a double array
     * @param array   the array 
     * @return the mean of the array elements
     */
    public static double calcMean( double[ ] array )
    {
        double sum = calcSum(array);
        double mean = sum / array.length;

        return mean;
    }    

    /******************    Read the toString Method but DO NOT MODIFY  ******************/        
    /**
     * Returns a string representation of the array i.e. a comma separated list 
     * of elements within [ ].  Similar to java.util.Arrays.toString(double[] a) method.
     * Each array element will be displayed by String.valueOf(double).
     * @param array  the array whose string representation is required
     * @return a string representation of array
     */
    public static String toString( double[] array )
    {
        String arrayStr = "[";

        for ( int i = 0; i < array.length; i++)
        {
            if (i > 0)              // Insert comma separator after first one
                arrayStr += ", ";
            arrayStr += String.valueOf( array[i] );
        }
        arrayStr += "]";
        return arrayStr;
    }

    /************ f) Complete the makeArray Method, refer to 3 Tasks below ************/ 
    /**
     * Input a set of elements and store in the created array.
     * @param The user specifies the size of the array, and enters the elements.
     * @return the created array
     */
    public static double[] makeArray()
    {
        final String format = "%.2f";       
        Scanner input = new Scanner( System.in );

        System.out.print("How many numbers: ");
        int numNumbers = input.nextInt( );

        System.out.print("Enter lower and upper range limits: ");
        double lower = input.nextDouble( );
        double upper = input.nextDouble( );

        double[] array = new double [numNumbers];

        for (int i = 0; i < array.length; i++)
        {
            System.out.print("\nEnter a number: ");
            double number = input.nextDouble();
            while (number < lower || number > upper)
            {
                System.out.print("Enter a different number within range: ");
                number = input.nextDouble();
            }
            array[i] = number;
        }

        return array;      
    }

    /**
     * findMin determines the minimum value found in an array.
     * @param Find the minimum value of an array
     * @return The minimum value of an array
     */

    public static double findMin( double[] array)
    {
        double min = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if( array[i] < min)
            {
                min = array[i];
            }            
        }
        return min;
    }

    /**
     * findMin determines the maximum value found in an array.
     * @param Find the maximum value of an array
     * @return The maximum value of an array
     */

    public static double findMax( double[] array)
    {
        double max = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if( array[i] > max)
            {
                max = array[i];
            }            
        }
        return max;
    }

    /**
     * calcRange determines the range between the smallest and largest number in the array.
     * @param input array used to find range
     * @return the range of the largest minus the smallest value in the array
     */
    public static double calcRange( double[] array)
    {
        double min = findMin(array);
        double max = findMax(array);
        double range = max - min;

        return range;
    }

    /**
     * fill method is used to fill empty spaces in an array
     * @param this is an empty method created to be called for other method's use
     * @return there is no return
     */

    public static void fill( double[] array, double value)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = value;
        }
    }
}