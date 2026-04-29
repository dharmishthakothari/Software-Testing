package com.basic;

import java.util.Scanner;

// accept age from user and check user is eligible for votting or not
public class ConditionalStatement3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("User is eligible for votting");
        } else {
            System.out.println("user is not eligible for votting");
        }

    }
}
