/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise08;

import java.util.Scanner;

/* Psuedocode
*Print statements, get user input 3 times
* Convert string into numerical values
* Calculate how many slices
* Calculate if there are any leftover slices per amount of people
* Print statement with required info
 */
public class Solution08 {
    private static final Scanner in = new Scanner(System.in);

    public static void main (String[] args){
    System.out.println("How many people?");
    String peopleAmount = in.nextLine();
    System.out.println("How many pizzas do you have?");
    String pizzaAmount = in.nextLine();
    System.out.println("How many slices per pizza?");
    String sliceAmount = in.nextLine();

    int peopleNum = Integer.parseInt(peopleAmount);
    int pizzaNum = Integer.parseInt(pizzaAmount);
    int sliceNum = Integer.parseInt(sliceAmount);

    int totalSlices = pizzaNum * sliceNum;
    int slicePerPerson = totalSlices/peopleNum;

    System.out.println(peopleNum +" people with "+ pizzaNum + " pizzas "+"("+ totalSlices + " slices)");
    System.out.println("Each person gets "+ slicePerPerson + " pieces of pizza.");

    int leftOverSlices = totalSlices % peopleNum;

    System.out.println("There are "+leftOverSlices+" leftover pieces.");

    }
}
