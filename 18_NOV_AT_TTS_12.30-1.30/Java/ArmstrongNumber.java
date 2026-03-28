package core;
import java.util.Scanner;
import java.math.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = scan.nextInt();
        int tNumber,number1;
        tNumber=number;
        number1=number;
        int rem, count = 0, sum = 0;
        //no of digit 
        while (number != 0) {
            rem = number % 10;
            count++;
           // sum = sum + rem;
            // System.out.println("rem " + rem);
            number = number / 10;
            // System.out.println("num " + number);
        }
        //sum of digit with power
        int pow_value;
        while (tNumber != 0) {
            rem = tNumber % 10;
            pow_value=(int) Math.pow(rem, count);
            sum = sum + pow_value;
            System.out.println("Sum "+sum);
            // System.out.println("rem " + rem);
            tNumber = tNumber / 10;
            // System.out.println("num " + number);
        }
        if(sum==number1)
        {
        	System.out.println("number is argstrong");
        }
        else
        	System.out.println("Number is not argstrng");
        
    }
}
