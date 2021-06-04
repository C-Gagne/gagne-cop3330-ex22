/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex22;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App mainApp = new App();
        System.out.println("Please enter the first number:");
        double x = mainApp.getNumber();
        System.out.println("Please enter the second number:");
        double y = mainApp.getNumber();
        System.out.println("Please enter the third number:");
        double z = mainApp.getNumber();


        if (mainApp.compareNumbers(x, y, z) == null)
        {
            System.out.println("There was an error with the numbers you entered. The largest number must be distinct. Please try again.");
        }
        else
        {
            double largestNum = mainApp.compareNumbers(x, y, z);
            String outputString = genOutputString(largestNum);
            System.out.println(outputString);
        }
    }

    public Double getNumber()
    {
        return in.nextDouble();
    }

    public Double compareNumbers(double x, double y, double z)
    {
        if ((x>y) && (x>z))
            return x;
        else if ((y>x) && (y>z))
            return y;
        else if ((z>x) && (z>y))
            return z;
        else
            return null;
    }

    public static String genOutputString(double largestNum)
    {
        return "The largest number is " + largestNum;
    }
}
