/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise19;

import java.util.Scanner;

/* Pseudocode
*Ask for user input
* Make a nested if statement that the string only contains numeric data
* Ends program if height or weight contain non-numeric data
* If only numeric data calculate bmi
* Set up conditions with results for ideal weight, overweight, or underweight
* Print statements of fail if statements do not have only numeric data
*/

public class Solution19 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double bmi;

   System.out.println("Please enter your height in inches:");
   String userHeight = in.nextLine();

       if (!userHeight.matches("[^\\d]")) {

           System.out.println("Please enter your weight in pounds:");
           String userWeight = in.nextLine();

           if(!userWeight.matches("[^\\d]")) {
               double heightNum = Double.parseDouble(userHeight);
               double weightNum = Double.parseDouble(userWeight);
                bmi = (weightNum/(heightNum*heightNum))*703;
                System.out.println("Your BMI is "+bmi);
                    if (bmi >= 18.5 && bmi <=25 ){
                        System.out.println("You are within the ideal weight range");
                    }
                        if (bmi <18.5){
                            System.out.println("You are underweight. You should see your doctor");

                        }if(bmi>25){
                            System.out.println("You are overweight. You should see your doctor");
                        }


           }
           else{
               System.out.println("Sorry, numbers only next time");
           }
       } else{
           System.out.println("Sorry, numbers only next time");
       }







    }
}
