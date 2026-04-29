package com.basic;

import java.util.Scanner;

public class For_loop_multiplication_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int no = scan.nextInt();
        // 8
        // 8 * 1 = 8
        // 8 * 2 =16
        // 8 * 3 =24
        // 8 * 4 =32....
        // 8 * 10 =80
        int mul = 1;
        for (int i = 1; i <= 10; i++) {
            mul = no * i;
            System.out.println(no + " * " + i + " = " + mul);
        }

    }
}
