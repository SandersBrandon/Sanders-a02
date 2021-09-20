/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise20;

import java.util.Scanner;

/* Psuedocode
* Obtain user input for order amount and state
* Create different if statements for the different states to get different taxes
* For wisconsin create nested statement that asks and checks for its county
* Calculate taxes based off of state and county
* Output statement with formatting and required information
*/
public class Solution20 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is the order amount? ");
        String orderAmount = in.nextLine();
        double amountNum = Double.parseDouble(orderAmount);

        System.out.println("What state do you live in? ");
        String userState = in.nextLine();

        if(userState.contains("Wisconsin")){
            double stateRate = 0.05;
            double stateTax = (stateRate*amountNum);
            double stateTotal = stateTax + amountNum;

            System.out.println("What county do you live in? ");
            String userCounty = in.nextLine();
            if(userCounty.contains("Eau Claire")){
                double countyRate = 0.005;
                double countyTax= (countyRate*stateTotal);
                double countyTotal = countyTax +stateTotal;
                double totalTax = countyTax+stateTax;
                System.out.println("The tax is $"+ String.format("%.2f",totalTax)
                + "\r\n" + "The total is $" + String.format("%.2f", countyTotal));
            }
            if(userCounty.contains("Dunn")){
                double countyRate = 0.004;
                double countyTax= (countyRate*stateTotal);
                double countyTotal = countyTax +stateTotal;
                double totalTax = countyTax+stateTax;

                System.out.println("The tax is $"+ String.format("%.2f",totalTax)
                        + "\r\n" + "The total is $" + String.format("%.2f", countyTotal));
            }

        }
        if(userState.contains("Illinois")){
            double stateRate = 0.08;
            double stateTax = (stateRate*amountNum);
            double stateTotal = stateTax + amountNum;

            System.out.println("The tax is $"+ String.format("%.2f",stateTax)
                    + "\r\n" + "The total is $" + String.format("%.2f", stateTotal));


        }
        if(!userState.contains("Illinois") && !userState.contains("Wisconsin")) {

            System.out.println("The tax is $0.00"
                    + "\r\n" + "The total is $" + String.format("%.2f", amountNum));
        }



    }
}
