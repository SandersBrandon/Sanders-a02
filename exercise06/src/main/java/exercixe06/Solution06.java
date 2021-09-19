/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercixe06;

import java.util.Calendar;
import java.util.Scanner;


/* Pseudo code
*  Print to screen a question and then scan user input for current age get currentAge
*  Print to screen a question and then scan user input for when they want to retire get retirement
* Subtract current age from retirement age for new variable subAge
* Use program to scan the computer for the current year convert to an integer named currentYear
* Add subAge to currentYear in new variable retireYear
* print to screen the currentYear and then the retireYear
*/


public class Solution06 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is your current age? ");
        String currentAge = in.nextLine();

        System.out.println("At what age would you like to retire? ");
        String retirement = in.nextLine();

        int x = Integer.parseInt(currentAge);
        int y = Integer.parseInt(retirement);
        int subAge = y - x;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = subAge + currentYear;

        System.out.println("You have " + subAge + " years left until you retire.");
        System.out.println("It's "+ currentYear + ", so you can retire in "+retireYear + ".");

    }
}
