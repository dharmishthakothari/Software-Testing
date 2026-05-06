package com.basic;

import java.util.Scanner;

public class ArrayExample5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = scan.next();
        char letters[] = name.toCharArray();
        int countVowel = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'u' || letters[i] == 'o')
                countVowel++;
        }
        System.out.println("No of Vowels are " + countVowel);
    }
}
