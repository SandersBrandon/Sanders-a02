/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise12;

import java.util.Scanner;

/* Pseudocode
*Print statements and getting user input
* Parse user input into numerical data
* Make sure to divide rate % by 100 for math
* Round up to next cent
* Output statement with correct formatting for money
*/

public class Solution12 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){

    System.out.println("Enter the principal: ");
    String principalAmount = in.nextLine();
    System.out.println("Enter the rate of interest as a percent %: ");
    String rateInterest = in.nextLine();
    System.out.println("Enter the number of years: ");
    String yearsAmount = in.nextLine();

    double principalNum = Double.parseDouble(principalAmount);
    double rateNum = Double.parseDouble(rateInterest);
    double rateNumDec = rateNum / 100;
    double yearsNum = Double.parseDouble(yearsAmount);

    double amountAccrued = (principalNum) + (principalNum * rateNumDec *yearsNum) + 0.01;

    System.out.println("After " + yearsNum + " years at " + (String.format("%.2f", rateNum)) + "%, the investment" +
            " will be worth $" + String.format("%.2f", amountAccrued) + ".");

    }
}
