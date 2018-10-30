
/**
 * Write a description of class MyMathTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMathTest
{
    public static void main(String[] args)
    {
    
    /**
     * Name:            testMean4
     * Purpose:         to test the MyMath mean4 method
     * Inputs:          a = 1.0, b = 2.0, c = 3.0, d = 4.0
     * Expected output: 2.5
     */
     
    double expectedMean4 = 2.5;
    double actualMean4 = MyMath.mean4(1.0, 2.0, 3.0, 4.0);
    
    System.out.println("testMean4: to test the MyMath mean4 method");
    System.out.print("MyMath.mean4(1.0, 2.0, 3.0, 4.0");
    System.out.println("  Result is" + actualMean4);
    
    if (actualMean4 == expectedMean4)
        System.out.println("Test passed");
    else
        System.out.println("Test failed");
    }
    
    /**
     * Name:            test int mean
     * Purpose:         to test the MyMath int mean method
     * Inputs:          
     */
}
