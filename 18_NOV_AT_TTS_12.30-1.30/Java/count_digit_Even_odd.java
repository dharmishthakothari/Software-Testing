
import java.util.Scanner;

public class count_digit_Even_odd {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        number = scan.nextInt();
        int rem, even_count = 0, odd_count = 0, sum = 0;
        while (number != 0) {
            rem = number % 10;
            if (rem % 2 == 0)

                even_count++;
            else
                odd_count++;
            // System.out.println("rem " + rem);
            number = number / 10;
            // System.out.println("num " + number);
        }
        System.out.println("Total no of even digits are " + even_count+" Odd Count ="+odd_count);
         
    }
}
