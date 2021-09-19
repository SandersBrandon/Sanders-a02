/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise17;

import java.util.Scanner;

/* Pseudocode
* Ask user for input, taking out non-numeric values from the string
* Turn strings into numerical variables if needed
* Calculate BAC based on the user response
* Compare BAC to legal threshold and give dynamic print statment depending on user's BAC calculated
*/
public class Solution17 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Enter a 1 if you are male or 2 if you are female :");
        String userMF = in.nextLine();

        userMF = userMF.replaceAll("[^1-2]","");


        System.out.println("How many ounces of alcohol did you have? ");
        String alcoholAmount = in.nextLine();

        alcoholAmount = alcoholAmount.replaceAll("[^0-9]","");
        double alcoholNum = Double.parseDouble(alcoholAmount);

        System.out.println("What is your weight, in pounds?");
        String userWeight = in.nextLine();

        userWeight = userWeight.replaceAll("[^0-9]","");
        double weightNum = Double.parseDouble(userWeight);

        System.out.println("How many hours has it been since your last drink? ");
        String userHours = in.nextLine();

        userHours = userHours.replaceAll("[^0-9]","");
        double hoursNum = Double.parseDouble(userHours);

        double menRatio = 0.73;
        double girlRatio = 0.66;


        if (userMF == "1"){
            double bloodAC = (alcoholNum * 5.14 / weightNum * menRatio) - (.015 * hoursNum);

            System.out.println("Your BAC is " +bloodAC);

                                 if (bloodAC >= 0.08){

                    System.out.println("It is not legal for you to drive");
                                 } else{
                    System.out.println("It is legal for you to drive");
                      }

                         }
        else {
            double bloodAC = (alcoholNum * 5.14 / weightNum * girlRatio) - (.015 * hoursNum);

            System.out.println("Your BAC is " +bloodAC);

                if (bloodAC >= 0.08){

                System.out.println("It is not legal for you to drive");
                } else{

                    System.out.println("It is legal for you to drive");


        }


    }
}}
