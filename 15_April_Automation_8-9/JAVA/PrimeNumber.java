package com.basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = scan.nextInt();
        int temp = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not prime");
                break;
            } else {

                temp = 1;
            }
        }
        if (temp == 1) {
            System.out.println(number + " is prime ");
        }
    }
}
