/*
        Name:  Dana Alsibai
        Assignment:  Revel Book
        Program:find the number of year
        Date: June 12th, 2020;
    
        Description:
        Write a program that prompts the user to enter the minutes
(e.g., 1 billion), and displays the number of years and days for the minutes. 
For simplicity, assume a year has 365 days. Here is a sample run: 
 */
package findnumberofyears;

import java.util.Scanner;

/**
 *
 * @author danasebai
 */
public class FindNUmberOfYears {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        int minutes = sc.nextInt();

        int years = minutes / 525600;

        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + day + " days.");

    }
}
