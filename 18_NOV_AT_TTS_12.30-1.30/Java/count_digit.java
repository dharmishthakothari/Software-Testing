
import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        number = scan.nextInt();
        int rem, count = 0, sum = 0;
        while (number != 0) {
            rem = number % 10;
            count++;
            sum = sum + rem;
            // System.out.println("rem " + rem);
            number = number / 10;
            // System.out.println("num " + number);
        }
        System.out.println("Total no of digits are " + count);
        System.out.println("Sum of number is " + sum);
    }
}
