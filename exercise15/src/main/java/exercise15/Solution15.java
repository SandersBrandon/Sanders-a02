/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise15;

import java.util.Scanner;

/* Pseudocode
* Create specified password
* Print statements obtain user input
* Create if else statement that compares the password given to the saved password
* If yes print welcome
* If no print i dont know you
*
*/

public class Solution15 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){
        String savedPassword = new String("abc$123");

        System.out.println("What is your username?");
        String userName = in.nextLine();
        System.out.println("What is the password?");
        String passwordAnswer = in.nextLine();

        if (passwordAnswer.equals(savedPassword)){
            System.out.println("Welcome!");
        } else{
            System.out.println("I don't know you.");
        }

    }
}
