/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise16;

import java.util.Scanner;

/* Pseudocode
* Print statement asking for user input
* Convert user input into numerical data
* Create a ternary function which checks if user is at the threshold age to drive
* Create statements to be printed dynamically based off of the user age
*/

public class Solution16 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){
    System.out.println("What is your age?");
    String userAge = in.nextLine();

    double ageNum = Double.parseDouble(userAge);

    double drivingAge = 16;

    String driverStatement = (ageNum >=drivingAge) ? "You are old enough to legally drive." : "You are not old enough to legally drive";
            System.out.println(driverStatement);
    }
}
