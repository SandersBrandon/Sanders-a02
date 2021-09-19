/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise14;

import java.util.Scanner;

/*Pseudocode
*Print statements and obtaining user input
* Parse user input into numerical data except the state
* Create if statement (no else) to check is state string is WI
* If yes add tax and make output with required information
* If no, print the total amount
* 
*/
public class Solution14 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("What is the order amount? ");
        String orderAmount = in.nextLine();
        System.out.println("What is the state? ");
        String stateAnswer = in.nextLine();

        double orderPrice = Double.parseDouble(orderAmount) ;
        double wisconsinTax = 0.055;
        double taxAmount = wisconsinTax * orderPrice;


        if ( stateAnswer.contains("WI")){
            double orderTotal = taxAmount + orderPrice;
            System.out.println( "The subtotal is $" + String.format("%.2f",orderPrice) +"\r\n"+"The tax is $" + taxAmount + "\r\n" + "The total is $" + String.format("%.2f", orderTotal) );

        }
        System.out.println("The total is $" + String.format(orderAmount));
    }
}
