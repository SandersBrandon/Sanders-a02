/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise21;

import java.util.Scanner;

/* Pseudocode
*Ask for user input obtain and make into numerical data
* Create conditon to dynamically change a number to it's respective month
* Only use a single output with correct number to it's month
* Default an error
*/

public class Solution21 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Please enter the number of the month:");
    String userAns = in.nextLine();

    int userNum = Integer.parseInt(userAns);

    if(userNum >=1){
        String month = "";

        int monthNum = userNum;

        switch(monthNum){
            case 1:  month = "January";
                break;

            case 2:  month = "February";
                break;

            case 3:  month = "March";
                break;

            case 4:  month = "April";
                break;

            case 5:  month = "May";
                break;

            case 6:  month = "June";
                break;

            case 7:  month = "July";
                break;

            case 8:  month = "August";
                break;

            case 9:  month = "September";
                break;

            case 10: month = "October";
                break;

            case 11: month = "November";
                break;

            case 12: month = "December";
                break;

            default: month = "(Invalid entry)";
                break;

            }
        System.out.println("The name of the month is "+month);

        }

    }

}
