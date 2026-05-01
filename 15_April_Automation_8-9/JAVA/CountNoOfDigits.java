package com.basic;

import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rem, count = 0;
        System.out.println("Enter number ");
        int number = scan.nextInt();
        while (number != 0) {
            rem = number % 10;
            // System.out.println("rem = " + rem);
            count++;
            number = number / 10;
            // System.out.println("number = " + number);

        }
        System.out.println("No of Digits are " + count);
    }
}
