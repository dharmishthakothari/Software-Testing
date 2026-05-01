package com.basic;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no1, no2, ans;
        while (true) {
            System.out.println(
                    "\n\n1. Addition\n2. Substraction\n3. Division\n4. Multiplication\n5. Exit\n\n\nEnter your Choice ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter 2 numbers ");
                    no1 = scan.nextInt();
                    no2 = scan.nextInt();
                    ans = no1 + no2;
                    System.out.println("Addition is " + ans);
                    break;
                case 2:
                    System.out.println("Enter 2 numbers ");
                    no1 = scan.nextInt();
                    no2 = scan.nextInt();
                    ans = no1 - no2;
                    System.out.println("Substraction is " + ans);
                    break;
                case 3:
                    System.out.println("Enter 2 numbers ");
                    no1 = scan.nextInt();
                    no2 = scan.nextInt();
                    ans = no1 / no2;
                    System.out.println("Division is " + ans);
                    break;
                case 4:
                    System.out.println("Enter 2 numbers ");
                    no1 = scan.nextInt();
                    no2 = scan.nextInt();
                    ans = no1 * no2;
                    System.out.println("Multiplication is " + ans);
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Please enter valid choice ");
                    break;
            }
        }
    }
}
