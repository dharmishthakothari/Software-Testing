package com.basic;

import java.util.Scanner;

// Program to accept 2 numbers from user and display greater number 
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int no1 = scan.nextInt();

        System.out.println("Enter number 2 ");
        int no2 = scan.nextInt();

        if (no1 > no2) {
            System.out.println("Greater number is " + no1);
        } else {
            System.out.println("Greater number is " + no2);
        }
    }

}
