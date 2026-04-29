package com.basic;

import java.util.Scanner;

public class ConditionalStatement4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total marks ");
        int total_marks = scan.nextInt();
        if (total_marks > 0)
        // Grade A ---100 - 70
        {
            if (total_marks >= 70 && total_marks <= 100) {
                System.out.println("A Grade");
            } else if (total_marks >= 50 && total_marks <= 69) {
                System.out.println("B Grade");
            } else if (total_marks >= 35 && total_marks <= 49) {
                System.out.println("C Grade");
            } else
                System.out.println("Fail");
        } else
            System.out.println("Enter valid marks ");

    }
}
