package com.basic;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int no1 = scan.nextInt();

        System.out.println("Enter number 2 ");
        int no2 = scan.nextInt();

        System.out.println(no1 + " > " + no2 + " = " + (no1 > no2));
        System.out.println(no1 + " < " + no2 + " = " + (no1 < no2));
        System.out.println(no1 + " >= " + no2 + " = " + (no1 >= no2));
        System.out.println(no1 + " <= " + no2 + " = " + (no1 <= no2));
        System.out.println(no1 + " != " + no2 + " = " + (no1 != no2));
        System.out.println(no1 + "==" + no2 + "=" + (no1 == no2));

    }
}
