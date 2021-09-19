/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */

package exercise11;

import java.util.Scanner;

/* Psuedocode
* Print statements and obtaining user input
* Change user input into numerical values
* Make the dollar amount round up to the next penny
* Using a single output statement with all required information as per the constraint
*
*/


public class Solution11 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){

        System.out.println("How many euros are you exchanging? ");
        String euroAmount = in.nextLine();
        System.out.println("What is the exchange rate? ");
        String exchangeRate = in.nextLine();

        double euroNum = Double.parseDouble(euroAmount);
        double exchangeNum = Double.parseDouble(exchangeRate);

        double dollarAmount = euroNum * exchangeNum + .01;

        System.out.println(String.format("%.2f", euroNum) +" euros at an exchange rate of " + String.format("%.5f", exchangeNum) +
                " is " + String.format("%.2f", dollarAmount));

    }
}
