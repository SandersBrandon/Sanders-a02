/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise18;

import java.util.Scanner;

/* Pseudocode
* Ask user for input for one of two options
* Obtain user input
* Create statement that allows for upper or lowercase letters of C or F
* Convert temperatures
* Print out only necessary and related lines
*/
public class Solution18 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celcius."
                + "\r\n" + "Press F to convert from Celcius to Fahrenheit."
                + "\r\n" + "Your choice:");

        String userChoice = in.nextLine();

        if (userChoice.contains("C") || userChoice.contains("c")) {
            System.out.println("Please enter the temperature in Fahrenheit:");
            String fahrenTemp = in.nextLine();

            double fahrenNum = Double.parseDouble(fahrenTemp);

            double convertNum = (fahrenNum - 32) * 5 / 9;
            System.out.println("The temperature in Celcius is " + convertNum);
        }
        if (userChoice.contains("F") || userChoice.contains("f")) {
            System.out.println("Please enter the temperature in Celcius:");
            String celciusTemp = in.nextLine();

            double celciusNum = Double.parseDouble(celciusTemp);

            double convertNum = (celciusNum * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + convertNum);

        }
    }
}
