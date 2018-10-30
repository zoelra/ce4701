
/**
 * MyMath implements a number of mathematical based functions
 * @author Zophia Raleigh
 * @version 25 October 2018
 */
public class MyMath
{
    // instance variables - replace the example below with your own
    private int x;

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
        double mean;
        mean = (a + b+ c+d)/4.0;
        return mean;
    }
    
    /**
     * Find the minimum of three parameters
     * @param a
     * @param b
     * @param c
     * @return
     */
    
    public static int min( int a, int b, int c)
    {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        return min;
    }
    
    /**
     * Find the minimum of three double parameters
     * @param a
     * @param b
     * @param c
     * @return
     */
    
    public static double min( double a, double b, double c)
    {
        double min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        return min;
    }
}
