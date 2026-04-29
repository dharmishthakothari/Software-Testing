package com.basic;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        String name, email;
        int age, c_no;
        float salary;
        // Scanner class hamne object banaya jiska naam obj hain
        // System.in ---- input from keyboard
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter name ");
        name = obj.next();

        System.out.println("Emter email ");
        email = obj.next();

        System.out.println("Enter age ");
        age = obj.nextInt();

        System.out.println("Enter contact no ");
        c_no = obj.nextInt();

        System.out.println("Enter salary ");
        salary = obj.nextFloat();

        System.out.println("Your name is  " + name);
        System.out.println("Your email is " + email);
        System.out.println("Your age is " + age);
        System.out.println("Your contact number is " + c_no);
        System.out.println("Your salary is " + salary);

    }
}
