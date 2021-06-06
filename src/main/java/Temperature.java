/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Enter choice (C or F): ");

        String converted = input.nextLine();

        if(converted.equalsIgnoreCase("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int F = input.nextInt();
            double C = (F - 32.0) * 5.0 / 9.0;
            System.out.print("The temperature in Celsius is " + C);
        }

        if(converted.equalsIgnoreCase("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            int C = input.nextInt();
            double F = (C * 9.0 / 5.0) + 32.0;
            System.out.print("The temperature in Fahrenheit is " + F);
        }

    }
}

