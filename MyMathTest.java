/**
 * MyMathTest tests MyMath
 *
 * @author1 Zophia Raleigh 
 * @author2 Ny Nguyen
 * @version 6 November 2018
 */
public class MyMathTest
{
    public static void main(String[] args)
    {
        /**
         * Name:            testMean4
         * Purpose:         to test the MyMath mean4 method
         * Inputs:          a = 1.0, b = 2.0, c = 4.0, d = 8.0
         * Expected output: 3.75
         */

        double expectedMean4 = 2.5;
        double actualMean4 = MyMath.mean4(1.0, 2.0, 3.0, 4.0);

        System.out.println("testMean4: to test the MyMath mean4 method");
        System.out.print("MyMath.mean4(1.0, 2.0, 3.0, 4.0");
        System.out.println("  Result is  " + actualMean4);

        if (actualMean4 == expectedMean4)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");

        /**
         * Name:            test int min1
         * Purpose:         to test the MyMath int min1 method
         * Inputs:          a = 2, b = 3, c = 4
         * Expected output: 2
         */

        int expectedMin1 = 2;
        int actualMin1 = MyMath.min1(2, 3, 4);

        System.out.println("testMin1: to test the MyMath min1 method");
        System.out.print("MyMath.min1(1, 2, 3, 4");
        System.out.println("  Result is" + actualMin1);      

        /**
         * Name:            test double minD
         * Purpose:         to test the MyMath double minD method
         * Inputs:          a = 2.0, b = 3.0, c = 4.0
         * Expected output: 2.0
         */

        double expectedMinD = 2.0;
        double actualMinD = MyMath.minD(2.0, 3.0, 4.0);

        System.out.println("testMinD: to test the MyMath minD method");
        System.out.print("MyMath.minD(1.0, 2.0, 3.0, 4.0");
        System.out.println("  Result is" + actualMinD);      

        /**
         * Name:            test long factorial
         * Purpose:         to test the MyMath long factorial method
         * Inputs:          n = 20
         * Expected output: 2432902008176640000
         */

        long expectedFactorial = 2432902008176640000L;
        long actualFactorial = MyMath.factorial(20);

        System.out.println("testFactorial: to test the MyMath factorial method");
        System.out.print("MyMath.factorial(20)");
        System.out.println("  Result is " + actualFactorial);

        /**
         * Name:            test sumN 
         * Purpose:         to test the MyMath int sumN method
         * Inputs:          n = 10
         * Expected output: 55
         */

        int expectedsumN = 55;
        int actualSumN = MyMath.sumN(10);

        System.out.println("testSumN: to test the MyMath sumN method");
        System.out.print("MyMath.sumN(10)");
        System.out.println("  Result is " + actualSumN);

        /**
         * Name:            test long biCoeff
         * Purpose:         to test the MyMath long biCoeff method
         * Inputs:          n = 5, k = 3
         * Expected output: 10
         */

        long expectedBiCoeff = 10;
        long actualBiCoeff = MyMath.biCoeff(5,3);

        System.out.println("testBiCoeff: to test the MyMath biCoeff method");
        System.out.print("MyMath.biCoeff(5,3)");
        System.out.println("  Result is " + actualBiCoeff);

        /**
         * Name:            test double power
         * Purpose:         to test the MyMath double power method
         * Inputs:          n = 5.0, k = 3
         * Expected output: 125
         */

        int expectedPower = 125;
        double actualPower = MyMath.power(5.0 ,3);

        System.out.println("testpower: to test the MyMath power method");
        System.out.print("MyMath.power(5.0 , 3)");
        System.out.println("  Result is " + actualPower);

        /**
         * Name:            test double findFarenheit
         * Purpose:         to test the MyMath double findFarenheit method
         * Inputs:          c = 15
         * Expected output: 59
         */

        int expectedFindFarenheit = 59;
        double actualFindFarenheit = MyMath.findFarenheit(15);

        System.out.println("testProduct: to test the MyMath findFarenheit method");
        System.out.print("MyMath.findFarenheit(15)");
        System.out.println("  Result is " + actualFindFarenheit);

        /**
         * Name:            test double amount 
         * Purpose:         to test the MyMath double amount method
         * Inputs:          p = 100.0, r = 8.0%, n = 4, t = 10
         * Expected output: 220.8
         */

        double expectedAmount = 220.8;
        double actualAmount = MyMath.amount(100.0, 0.08, 4, 10);

        System.out.println("testAmount: to test the MyMath amount method");
        System.out.print("MyMath.findAmount(100.0, 0.08, 4, 10)");
        System.out.println("  Result is " + actualAmount);

        /**
         * Name:            test sumSquare 
         * Purpose:         to test the MyMath int sumSquare method
         * Inputs:          n = 4
         * Expected output: 30
         */

        double expectedSumSquare = 30;
        double actualSumSquare = MyMath.sumSquare(4);

        System.out.println("testSumSquare: to test the MyMath sumSquare method");
        System.out.print("MyMath.sumSquare(4)");
        System.out.println("  Result is " + actualSumSquare);

        if(actualSumSquare == expectedSumSquare)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        /**
         * Name:            test isPrime
         * Purpose:         to test the MyMath isPrime method
         * Inputs:          n = 7
         * Expected output: True
         */

        boolean expectedIsPrime = true;
        boolean actualIsPrime = MyMath.isPrime(7);

        System.out.println("testIsPrime: to test the MyMath isPrime method");
        System.out.print("MyMath.isPrime(7)");
        System.out.println("  Result is " + actualIsPrime);

        if (actualIsPrime == expectedIsPrime)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        /**
         * Name:                test double calcPi
         * Purpose:             to test the MyMath calcPi method
         * Inputs:              numberOfTerms = 20
         * Expected output:     3.091623806668
         */

        double expectedCalcPi = 3.09162380666784;
        double actualCalcPi = MyMath.calcPi(20);

        System.out.println("testCaplcPi: to test the MyMath calcPi method");
        System.out.print("MyMath.calcPi(20)");
        System.out.println("  Result is " + actualCalcPi);
        
        if (actualCalcPi == expectedCalcPi)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed" + expectedCalcPi);
    }
}

