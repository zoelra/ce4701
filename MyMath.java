/**
 * MyMath implements a number of mathematical based functions
 * @author1 Zophia Raleigh
 * @author2 Ny Nguyen
 * @version 7 November 2018
 */
public class MyMath
{

    /**
     * Calculate the mean of the four parameters
     * @param a the first parameter
     * @param b the second parameter
     * @param c the third parameter
     * @param d the fourth parameter
     * @return the mean of the paramenters 
     */

    public static double mean4(double a, double b, double c, double d)
    {
        // Body of the method does the action
        double mean4;
        mean4 = ((a + b + c + d)/4);
        return mean4;
    }

    public static int min1( int a, int b, int c)
    {
        int min1 = a;
        if (b < min1)
            min1 = b;
        if (c < min1)
            min1 = c;
        return min1;
    }

    public static double minD( double a, double b, double c)
    {
        double minD = a;
        if (b < minD)
            minD = b;
        if (c < minD)
            minD = c;
        return minD;
    }

    /**
     * Calculate n factorial (n!), n less than 21.
     * @param n the argument whose factorial is required
     * @return the factorial of the argument
     */
    public static long factorial( int n)
    {
        long result = 1;
        int counter = 2;
        while (counter <= n)
        {
            result = result * counter;
            counter++;
        }
        return result;
    }

    /**
     * Calculate n sum (n1 + n2 ... +nn).
     * @param n the argument whose sigma sum is required
     * @return the sum of the argument
     */
    public static int sumN( int n)
    {
        int result = 0;
        int counter = 1;
        while (counter <= n)
        {
            result += counter;
            counter++;
        }
        return result;
    }

    /**
     * Calculate n choose k for two inputs.
     * @param n the argument whose binomial coefficient is required
     * @param k the argument whose part of the binomial coefficient
     * @return the binomial coefficient of the argument
     */
    public static long biCoeff( int n, int k )
    {
        return factorial(n)/factorial(k)/factorial(n-k);
    }

    /**
     * Calculate a^b
     * @param a the argument is a double and the base value
     * @param b the argument is an int and the exponent value
     * @return the value of a^b
     */
    public static double power(double a, int b)
    {
        double result = 1.0;
        if (b > 0)
        {
            for(int i = 0; i < b; i++)
                result = result *= a;
        }
        else
        {
            b*=-1;
            for(int i = 0; i < b; i++)
                result = result/=a;
        }
        return result;
    }

    /**
     * @Author1 Zophia Raleigh
     * Caluclate an input celcius value to its farenheit equivalent
     * @param c the celcius input provided by the user
     * @return the farenheit value of the celcius input
     */
    public static double findFarenheit(int c)
    {
        double b = 9.0/5.0;
        double d = b * c;
        System.out.println(d);
        return (d + 32);
    }

    /**
     * @Author1 Zophia Raleigh
     * Calculate the compound interest of user inputs.
     * @param p the principal starting amount
     * @param r the interest rate
     * @param n the number of compounds a year
     * @param t the number of years
     * @return the amount for p(1 + (r/n))^nt
     */
    public static double amount(double p, double r, int n, int t)
    {
        double power = n * t;
        double rate = 1 + (r/n);
        double result = p * Math.pow(rate, power);

        return Math.round(result * 100.0) / 100.0;
    }

    /**
     * @Author2 Ny Nguyen
     * @idNumber2 18157157
     * Caluclate the sum of the sqaure of the n natural numbers from 1 to n
     */
    public static int sumSquare(int n)
    {
        int result = 0;
        int counter = 1;
        while (counter <= n)
        {
            result = result + (counter*counter);
            counter ++;
        }
        return result;
    }

    /**
     * @Author2 Ny Nguyen
     * @idNumber2 18157257
     * Caluclate to see if a number is prime
     */
    public static boolean isPrime(int n)
    {
        if (n<=1)
        {
            return false;
        }
        else
        {
            int p = 2;
            while (p<n)
            {
                if(n%p==0)
                    return false;
                p++;
            }
            return true;
        }
    }

    /**
     * Calculate the value of pi for an infinite number of inputs
     * @param numberOfTerms the number provided by the user
     * @return the value of pi for the provided number of input
     */
    public static double calcPi(int numberOfTerms)
    {
        int n = 3;
        double pi = 4.0;
        boolean first = true;
        for (int i = 0; i < numberOfTerms; i++)
        {
            if (first)
                first = false;
            else
            {
                if (i%2 == 0)
                    pi += 4.0/n;
                else
                    pi -= 4.0/n;
                n += 2;
            }
        }
        
        return pi;
    }
}
