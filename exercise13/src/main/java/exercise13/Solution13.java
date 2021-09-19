/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise13;

/* Pseudocode
* Print statements and getting user input
* Convert user input into numerical data
* Divide rate of interest by 100 for actual number
* Figure out how to add a power to a number
* Make formula for total amount at end of the investment
* Output statement with required information formatted and rounding to nearest cent
*/

import java.util.Scanner;
import java.lang.Math;

public class Solution13 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){

        System.out.println("What is the principal amount: ");
        String principalAmount = in.nextLine();
        System.out.println("What is the rate of interest as a percent %: ");
        String rateInterest = in.nextLine();
        System.out.println("What is the number of years: ");
        String yearsAmount = in.nextLine();
        System.out.println("What is the number of times the investment is compounded per year?: ");
        String compoundAmount = in.nextLine();

        double principalNum = Double.parseDouble(principalAmount);
        double rateNum = Double.parseDouble(rateInterest);
        double rateNumDec = rateNum / 100;
        double yearsNum = Double.parseDouble(yearsAmount);
        double compoundNum = Double.parseDouble(compoundAmount);

        double amountAccrued = (1 + (rateNumDec/compoundNum));
        double accruedPower = compoundNum * yearsNum;
        double totalAccrued = Math.pow((amountAccrued), accruedPower);
        totalAccrued = totalAccrued * principalNum;


        System.out.println("$" + String.format("%.2f", principalNum) + " invested at " + String.format("%.2f", rateNum) + "% for " +
                yearsNum + " years compounded " + compoundNum + " times per year is $" +String.format("%.2f", totalAccrued));

    }
}
