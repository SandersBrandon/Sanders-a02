/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise22;

import java.util.Scanner;

/* Pseudocode
*Ask for user input obtain input convert into numerical data
* Check to see if any are the same number if yes exit the program
* If they all different check to see which is the largest number
* Output statement with require information
*/

public class Solution22 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        String firstAns = in.nextLine();
        System.out.println("Enter the second number:");
        String secondAns = in.nextLine();
        System.out.println("Enter the third number:");
        String thirdAns = in.nextLine();

        int firstNum = Integer.parseInt(firstAns);
        int secondNum = Integer.parseInt(secondAns);
        int thirdNum = Integer.parseInt(thirdAns);

        if(firstNum == secondNum || firstNum ==thirdNum || secondNum == thirdNum){
            System.exit(0);
        }

            if(firstNum > secondNum && firstNum >thirdNum){

            System.out.println("The largest number is "+ firstNum);
            }

            if(secondNum > firstNum && secondNum >thirdNum){

            System.out.println("The largest number is "+ secondNum);
        }
             if(thirdNum > secondNum && thirdNum >firstNum){

            System.out.println("The largest number is "+ thirdNum);
        }
    }
}
