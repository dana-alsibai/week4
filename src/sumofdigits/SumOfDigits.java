/*
        Name:  Dana Alsibai
        Assignment:  Revel Book
        Program: 
        Date:  June 12th, 2020
    
        Description:
         (Sum the digits in an integer) 
 */
package sumofdigits;

import java.util.Scanner;

/**
 *
 * @author danasebai
 */
public class SumOfDigits {

    public static void main(String[] args) {

        System.out.print("Enter an integer between 0 and 1000: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int firstDigit = number % 10;

        number = number / 10;

        int secondDigit = number % 10;

        number = number / 10;

        int total = firstDigit + secondDigit + number;

        System.out.print("The sum of all digits in " + "number is " + total);

    }
} 
