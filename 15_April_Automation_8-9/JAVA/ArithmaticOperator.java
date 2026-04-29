package com.basic;

import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {
        int num1, num2, ans;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number 1 ");
        num1 = obj.nextInt();

        System.out.println("Enter number 2 ");
        num2 = obj.nextInt();

        ans = num1 + num2;
        // System.out.println("Addition is " + ans);
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + ans);

    }
}
