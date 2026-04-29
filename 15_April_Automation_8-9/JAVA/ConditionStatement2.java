package com.basic;

import java.util.Scanner;

// Accept number from user and check number is +ve or nagative
public class ConditionStatement2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int no1 = scan.nextInt();

        if (no1 > 0) {
            System.out.println("Number is Positive ");
        } else if (no1 < 0) {
            System.out.println("Number is Nagative ");

        } else {
            System.out.println("Number is zero ");
        }

    }
}
