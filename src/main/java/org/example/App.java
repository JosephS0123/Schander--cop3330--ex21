/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;



import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner uInput = new Scanner(System.in);
        System.out.println( "Enter a number from 1-12 to choose a month" );
        int month = uInput.nextInt();
        String Month;
        switch (month) {
            case 1:  Month = "January";
            break;
            case 2:  Month = "February";
            break;
            case 3:  Month = "March";
            break;
            case 4:  Month = "April";
            break;
            case 5:  Month = "May";
            break;
            case 6:  Month = "June";
            break;
            case 7:  Month = "July";
            break;
            case 8:  Month = "August";
            break;
            case 9:  Month = "September";
            break;
            case 10: Month = "October";
            break;
            case 11: Month = "November";
            break;
            case 12: Month = "December";
            break;
            default: Month = "Invalid Input";
        }
        System.out.println("The name of the month is "+Month);
    }
}
