package exercise07;

import java.util.Scanner;

public class Solution07 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("What is the length of the room in feet?");
        String feetLength = in.nextLine();
        System.out.println("What is the width of the room in feet?");
        String feetWidth = in.nextLine();

        System.out.println("You entered dimensions of "+feetLength +" feet by "+ feetWidth + " feet.");

        double feetLengthNum = Integer.parseInt(feetLength);
        double feetWidthNum = Integer.parseInt(feetWidth);

        double squareFeet= feetLengthNum * feetWidthNum;


        System.out.println("The area is");
        System.out.println(String.format("%.3f",squareFeet) + " square feet");

        double conversionNum = 0.09290304;
        double squareMeters = squareFeet * conversionNum;

        System.out.println(  String.format("%.3f",squareMeters) + " square meters");

    }
}
