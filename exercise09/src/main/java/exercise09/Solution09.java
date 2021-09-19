/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise09;

import java.util.Scanner;

public class Solution09 {
    public static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Enter length of the room:");
        String feetLength = in.nextLine();
        System.out.println("Enter width of the room:");
        String feetWidth = in.nextLine();

        int lengthNum = Integer.parseInt(feetLength);
        int widthNum = Integer.parseInt(feetWidth);
        int squareFeet = lengthNum * widthNum;
        int paintGallon = 350;
        int gallonsNeeded = squareFeet / paintGallon;
        int leftOver = squareFeet % paintGallon;

        if ( leftOver> 0){
            gallonsNeeded++;
        }

        System.out.println("You will need to purchase "+ gallonsNeeded + " gallons of paint to cover " + squareFeet+ " squarefeet");
    }
}
