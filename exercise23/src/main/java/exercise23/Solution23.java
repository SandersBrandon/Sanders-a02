/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Sanders
 */
package exercise23;

import java.util.Scanner;

/* Pseudocode
*Try and built the tree using PlantUML(update couldnt figure it out in time had to visualize it with the software)
* Build a system of if and else statements to direct where they are in the troubleshooting window
* Create statements respective to previous answer, then if required end program there
* If not ending keep going with another if else statement for the outcome depending on the user answer
*/
public class Solution23 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Only 'y' or 'n' will be accpeted" + "\r\n"+
                "Is the car silent when you turn the key?");
        String answer1 = in.nextLine();

        if(answer1.contains("y")){
            System.out.println("Are the battery terminals corroded?");

            String answer2 = in.nextLine();

            if(answer2.contains("y")){
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);

            } else{
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }


        }if(answer1.contains("n")){
            System.out.println("Does the car make a slicking noise?");
            String answer3 = in.nextLine();

            if(answer3.contains("y")){
                System.out.println("Replace the battery.");
                System.exit(0);

        }   else{
            System.out.println("Does the car crank up but fail to start?");
            String answer4 = in.nextLine();

                if(answer4.contains("y")){
                    System.out.println("Check spark plug connection.");
                    System.exit(0);

                } else {
                    System.out.println("Does the engine start and then die?");
                    String answer5 = in.nextLine();

                        if(answer5.contains("y")){
                            System.out.println("Does your car have fuel injection?");
                            String answer6= in.nextLine();

                            if(answer6.contains("y")){
                                System.out.println("Get it in for service.");
                                System.exit(0);

                            } else{
                                System.out.println("Check to ensure the choke is opening and closing.");
                                System.exit(0);
                            }
                        } else {
                            System.out.println("This should not be possible.");
                            System.exit(0);
                        }

                }

            }
        }

    }
}
