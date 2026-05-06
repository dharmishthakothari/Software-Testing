package com.basic;

public class ArrayExample4 {
    public static void main(String[] args) {
        int[] numbers = { 1, 23, 45, 66, 88, 12, 14, 15, 11 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even  ");
            } else
                System.out.println(numbers[i] + " is odd  ");
        }
    }
}
