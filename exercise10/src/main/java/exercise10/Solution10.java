
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise10;

import java.util.Scanner;

/* Psuedocode
* Print statements and getting user input for price and quantity of items
* Use variable for tax rate
*Parse strings to convert into numerical values
*Calculate subtotal, tax amount, and total cost of all items
* Print out formatting answers into 2 decimal places like real transaction receipts
*/

public class Solution10 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Enter the price of item 1: ");
        String itemOne = in.nextLine();
        System.out.println("Enter the quantity of item 1: ");
        String itemOneQuantity = in.nextLine();
        System.out.println("Enter the price of item 2: ");
        String itemTwo = in.nextLine();
        System.out.println("Enter the quantity of item 2: ");
        String itemTwoQuantity = in.nextLine();
        System.out.println("Enter the price of item 3: ");
        String itemThree = in.nextLine();
        System.out.println("Enter the quantity of item 3: ");
        String itemThreeQuantity = in.nextLine();

        double taxRate = 0.055;

        double priceOne = Integer.parseInt(itemOne);
        double quantityOne = Integer.parseInt(itemOneQuantity);
        double priceTwo = Integer.parseInt(itemTwo);
        double quantityTwo = Integer.parseInt(itemTwoQuantity);
        double priceThree = Integer.parseInt(itemThree);
        double quantityThree = Integer.parseInt(itemThreeQuantity);

        double subtotalPrice = (priceOne * quantityOne) + (priceTwo * quantityTwo) + (priceThree * quantityThree);

        double taxPrice = taxRate * subtotalPrice;

        double totalPrice = taxPrice + subtotalPrice;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotalPrice));
        System.out.println("Tax: $"+ String.format("%.2f", taxPrice) );
        System.out.println("Total: $" + String.format("%.2f", totalPrice) );



    }

}
