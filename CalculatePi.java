
/**
 * Class CalculatePi calclates the value of pi from an infinite series
 * @author1 Ny Nguyen
 * @author2 Zophia Raleigh
 * @version 6 November 2018
 * 
 * Seudo code
 * Calculate pi to an infinite series, print 20
 * method should return double, take int
 * print %14.12f
 * Print not in method
 * Print table as program executres
 * copy to myMath
 */

public class CalculatePi
{
    public static void main(String[] args)
    {
        System.out.println("# Terms Pi Calculated");
        for (int i = 1; i<=20; i++)
        {
            System.out.printf("%7d %14.12f\n", i, calcPi(i));
        }
    }

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
