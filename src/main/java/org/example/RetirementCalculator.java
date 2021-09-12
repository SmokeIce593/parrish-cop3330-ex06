/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;
import java.time.YearMonth;

public class RetirementCalculator {
        public static void main( String[] args ) {

            Scanner input = new Scanner(System.in);

            System.out.print( "What is your current age?" );
            String currentageString = input.nextLine();

            System.out.print( "At what age would you like to retire?" );
            String retirementageString = input.nextLine();

            int age = Integer.parseInt(currentageString);
            int retirementage = Integer.parseInt(retirementageString);

            int year = YearMonth.now().getYear();

            System.out.printf("You have %d years left until you can retire.", retirementage - age);
            System.out.printf("\nIt's %d, so you can retire in %d.", year, year + (retirementage - age));

        }
}