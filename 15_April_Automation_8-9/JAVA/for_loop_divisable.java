package com.basic;

import java.util.Scanner;

public class for_loop_divisable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // we have checked for single number
        // System.out.println("Enter number ");
        // int no = scan.nextInt();
        // if (no % 7 == 0) {
        // System.out.println("Number is divisable by 7");
        // } else
        // System.out.println("Number is not divisable by 7");

        // find those numbers which are divisable by 7 between 1 - 100
        // for (int i = 1; i <= 100; i++) {
        // if (i % 7 == 0) {
        // System.out.println(i + " is divisable by 7");
        // }
        // }

        // find those numbers which are divisable by 5 and 7 between 1000 and 2000
        for (int i = 1000; i <= 2000; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " is divisable by 5 & 7");
            }
        }

    }
}
