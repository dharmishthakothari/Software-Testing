package com.basic;

public class ArrayExample1 {
    public static void main(String[] args) {
        int roll_no[];
        roll_no = new int[100];
        int j = 1000;
        for (int i = 0; i < roll_no.length; i++) {
            roll_no[i] = j;
            j++;
        }
        for (int i = 0; i < roll_no.length; i++)
            System.out.println(roll_no[i]);

    }
}
