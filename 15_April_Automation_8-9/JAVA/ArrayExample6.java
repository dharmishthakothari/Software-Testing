package com.basic;

import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {
        int numbers[];
        numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number ");
            numbers[i] = scan.nextInt();
        }
        System.out.println("Entered Array is ");
        // printing

        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

    }
}
